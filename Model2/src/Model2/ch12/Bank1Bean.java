package Model2.ch12;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Bank1Bean {

	private int aid;
	private String aname;
	private int balance;
	
	//데이터 베이스 관련 객체 선언
	Connection conn=null;
	Statement stmt=null;
	PreparedStatement pstmt=null;
	
	//JNDI 를 통한 연결
	public void connect() {
		try {
			// context에 초기화
			Context initContext = new InitialContext();
			// lookup 메소드를 이용하여 특정 컨텍스트 참조를 받아온다
			Context envContext = (Context)initContext.lookup("java:/comp/env");
			// jdbc/orcl 이름으로 네이밍 되어있는 DataSource 객체를 받아온다
			DataSource ds=(DataSource)envContext.lookup("jdbc/orcl");
			// 커넥션 얻기
			conn = ds.getConnection();
			
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
	// Connection 반환해주기
	public void disconnect() {
		try {
			if(conn != null )
				conn.close();
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		System.out.println("Close");
	}
	
	public void getData() {
		connect();
		try {
			stmt = conn.createStatement(); // 연결이 유지되어 계속 사용가능 끊어줘야한다(disconnect();)
			ResultSet rs = stmt.executeQuery("select * from bank1");
			rs.next();// type을 row형태로 받아온다 
			// 그래서 현재 row의 결과에서 aid컬럼의 내용을 int형으로 변환하여 받아옴
			aid = rs.getInt("aid");
			aname = rs.getString("aname");
			balance = rs.getInt("balance");
			
		} catch (Exception e) {
			System.out.println(aid +aname+ balance);
			System.out.println(e);
		}
		finally {
			disconnect(); // conn.createStatement(); 소멸
		}
	}
		// 계좌이체 처리 메소드
	public boolean transfer (int bal) {
		 connect();
		 try {
			conn.setAutoCommit(false); // update delete를 제한
			// 계좌에서 금액 차감
			pstmt = conn.prepareStatement("update bank1 set balance=balance-? where aid=101");
			pstmt.setInt(1, bal);
			pstmt.executeUpdate();
			
			
			// 계좌에서 이체금액 증가
			pstmt = conn.prepareStatement("update bank2 set balance=balance+? where aid=201");
			pstmt.setInt(1, bal);
			pstmt.executeUpdate();
			stmt = conn.createStatement();
			
			ResultSet rs=stmt.executeQuery("select balance from bank2 where aid=201");
			
			rs.next();
			if(rs.getInt(1)< 0 || rs.getInt(1)>600000) {
				conn.rollback();
				return false;
			}else 
				conn.commit();
	
		} catch (Exception e) {
			System.out.println(e);
		}
		 finally {
			disconnect();
		}
		 return true;
	}
	
	public int getAid() {
		return aid;
	}
	
	public String getAname() {
		return aname;
	}
	
	public int getBalance() {
		return balance;
	}

	
}
