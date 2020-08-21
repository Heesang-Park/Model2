package Model2.ch10;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ItemTagHandler extends SimpleTagSupport{

	// 태그 속성 처리를 위한 멤버 변수
	private String bgcolor;
	private String border;
	
	// 시작 태그를 만나면 호출되는 메서드
	public void doTag() throws IOException, JspException{
		JspWriter out = getJspContext().getOut();
		// 태그 바디 처리 클래스 객체 생성
		JspFragment body = getJspBody();
		
		// 스트링버퍼를 이용해서 상품정보 출력을 위한 태그 생성
		Product product = new Product();
		StringBuffer msg = new StringBuffer();
		
		if(body!=null) {
			out.println("<h2>");
			body.invoke(null); // 본문에 내용을 body에 있는 내용을 뿌려주는 역활
			out.println("</h2>");
		}
		msg.append("<table border=")
		.append(border)
		.append(" bgcolor=")
		.append(bgcolor)
		.append(" width=150 >");
		
		out.println(msg.toString());
		
		// 상품의 목록 출력
		for(String item : product.getProductList()){
			out.println("<tr><td>" +item+"</td></tr>");
		}
		out.println("</table>");
		
	}

	public String getBgcolor() {
		return bgcolor;
	}

	public void setBgcolor(String bgcolor) {
		this.bgcolor = bgcolor;
	}

	public String getBorder() {
		return border;
	}

	public void setBorder(String border) {
		this.border = border;
	}
	
	
}
