package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MProc2")
public class MemberJoinProc2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		reqProc(req, res);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		reqProc(req, res);
		
	}
	protected void reqProc(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		// bean ¼ÂÆÃ
		MemberBean bean = new MemberBean();
		bean.setId(req.getParameter("id"));
		bean.setPass(req.getParameter("pass"));
		bean.setName(req.getParameter("name"));
		bean.setPhone(req.getParameter("phone"));
		bean.setEmail(req.getParameter("email"));
		
		// req°´Ã¼¿¡ bean°´Ã¼¸¦ ´ã´Â´Ù
		req.setAttribute("bean", bean);
		
		// jsp·Î ³Ñ±è
		RequestDispatcher dis = req.getRequestDispatcher("MemberView.jsp");
		dis.forward(req, res);
		
		
	}

}
