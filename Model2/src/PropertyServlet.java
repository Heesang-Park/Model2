

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ���� ���� �ֳ����̼�
@WebServlet(
		// ���� ȣ�� URL ����
		urlPatterns = {"/PropertyServlet"},
		// ���� �ʱ�ȭ �Ķ���� ����
		initParams = {
				@WebInitParam(name = "name1", value = "user1"),
				@WebInitParam(name = "name2", value = "user2")
		})
public class PropertyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public PropertyServlet() {
        super();
 
    }

	// GET ��� ȣ���� ��� doPost() �� ������
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	// POST ��� ��û�� ��� ����
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html; charset=euc-kr");
		out.println("<HTML><BODY><center>");
		out.println("<h2>ch14:PropertyServlet</h2>");
		out.println("<HR>");
		// ���� �ʱ�ȭ �Ķ���ͷ� ���޵� �� ���
		out.println("name1 : "+getInitParameter("name1")+"<br>");
		out.println("name2 : "+getInitParameter("name2"));
		
		out.println("<hr>");
		// �� ���ø����̼� �ʱ�ȭ �Ķ���ͷ� ���޵� �� ���
		out.println("name3 : "+getServletContext().getInitParameter("name3"));
		out.println("</center></BODY</HTML>");
	}

}
