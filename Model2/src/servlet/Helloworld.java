package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Helloworld")
public class Helloworld extends HttpServlet {
  
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		reqPro(req, res);
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		reqPro(req, res);
		
	}

	protected void reqPro(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//GET방식이던 POST방식이던 이걸로 다 사용하겠다
		
		// jsp쪽으로 넘겨서 화면에 출력
		String msg="Hello World";
		Integer data=07;
		
		req.setAttribute("msg", msg);
		req.setAttribute("data", data);
		
		//servlet->jsp 호출   자바코딩 한 것을 담아서 넘긴다
		RequestDispatcher dis = req.getRequestDispatcher("Helloworld.jsp");
		dis.forward(req, res);
		
	}
}
