package Model2.ch10;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MsgTagSimpleHandler extends SimpleTagSupport{
	
	// jsp에서 실행이 이루어지면 호출되는 메소드
	public void doTag() throws IOException{
		//JSP페이지의 결과를 웹브라우저에게 전송하는 클래스로 객체를 통해서 전달
		//getJspContext().getOut(); : 현재 JspContext객체를 얻을 수 있는 메소드
		JspWriter out = getJspContext().getOut();
		out.println("커스텀 태그 핸들러 출력 메세지 : Hello");
	}

}
