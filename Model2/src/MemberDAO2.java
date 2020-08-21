

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO2 {

	// ������ ���̽��� �����ϱ� ���� ���� ����
	Connection conn = null;
	
	PreparedStatement pstmt = null;
	ResultSet rs;
	
	public void getCon() {
		try {
			// �����ͺ��̽� ����
			Context initContext = new InitialContext();
			Context envContext = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/orcl");
			conn = ds.getConnection();	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
		//1. �����ͺ��̽��� �ѻ���� ȸ�������� �������ִ� �޼ҵ�(insert)
		public void insertMember(MemberBean2 mbean) {
		getCon();
		try {
			String sql ="insert into member values(?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, mbean.getId());
			pstmt.setString(2, mbean.getPass1());
			pstmt.setString(3, mbean.getPass2());
			pstmt.setString(4, mbean.getEmail());		
			pstmt.setString(5, mbean.getGender());		
			pstmt.setString(6, mbean.getAddress());		
			pstmt.setString(7, mbean.getPhone());		
			pstmt.setString(8, mbean.getHobby());		
			pstmt.setString(9, mbean.getJob());		
			pstmt.setString(10, mbean.getAge());		
			pstmt.setString(11, mbean.getInfo());
			
			pstmt.executeUpdate();
			
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		// 2. ��� ����ڵ��� �˻��ϴ� �޼ҵ� ����
		public Vector<MemberBean2> allSelectMember(){
			
			Vector<MemberBean2> v = new Vector<>();
			getCon();
			try {
				String sql = "select * from member";
				pstmt = conn.prepareStatement(sql);
				rs=pstmt.executeQuery();
				
				while(rs.next()) {
					MemberBean2 bean = new MemberBean2();
					bean.setId(rs.getString(1));
					bean.setPass1(rs.getString(2));
					bean.setPass2(rs.getString(3));
					bean.setEmail(rs.getString(4));
					bean.setGender(rs.getString(5));
					bean.setAddress(rs.getString(6));
					bean.setPhone(rs.getString(7));
					bean.setHobby(rs.getString(8));
					bean.setJob(rs.getString(9));
					bean.setAge(rs.getString(10));
					bean.setInfo(rs.getString(11));
					
					// �ڽ��� ���� ��, ���Ϳ� ����
					v.add(bean);
				}
					conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
				return v;
		}
	
		
	
}
