

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


   
@WebServlet("/proc.do")
public class MemberJoinServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		reqPro(req, res);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		reqPro(req, res);
		
	}
	protected void reqPro(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		
		// hobby�� üũ�ڽ��̹Ƿ� �迭�� �޴´�
		String [] arr = req.getParameterValues("hobby");
		String texthobby = "";
		
		for(String string:arr) {
			texthobby+= string+" "; // �ϳ��� ��Ʈ�������� ����
		}
		
		MemberBean2 bean = new MemberBean2();
		bean.setId(req.getParameter("id"));
		String pass1 = req.getParameter("pass1");
		String pass2 = req.getParameter("pass2");
		bean.setPass1(pass1);
		bean.setPass2(pass2);
		bean.setEmail(req.getParameter("eamil"));
		bean.setGender(req.getParameter("gender"));
		bean.setAddress(req.getParameter("address"));
		bean.setPhone(req.getParameter("phone"));
		bean.setHobby(texthobby);
		bean.setJob(req.getParameter("job"));
		bean.setAge(req.getParameter("age"));
		bean.setInfo(req.getParameter("info"));
		
		// �н����� ��ġ ���� �Ǵ� 
		if(pass1.equals(pass2)) {
			MemberDAO2 mdao = new MemberDAO2();
			mdao.insertMember(bean);
			
			RequestDispatcher dis= req.getRequestDispatcher("MemberListCon.do");
			dis.forward(req, res);
		}else {
			
			req.setAttribute("msg", "�н����尡 ��ġ���� �ʽ��ϴ�!!");
			RequestDispatcher dis = req.getRequestDispatcher("LoginError.jsp");
			dis.forward(req, res);
		}
			
		
		
		
		
	}
}
