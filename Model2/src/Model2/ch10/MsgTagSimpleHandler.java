package Model2.ch10;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MsgTagSimpleHandler extends SimpleTagSupport{
	
	// jsp���� ������ �̷������ ȣ��Ǵ� �޼ҵ�
	public void doTag() throws IOException{
		//JSP�������� ����� ������������ �����ϴ� Ŭ������ ��ü�� ���ؼ� ����
		//getJspContext().getOut(); : ���� JspContext��ü�� ���� �� �ִ� �޼ҵ�
		JspWriter out = getJspContext().getOut();
		out.println("Ŀ���� �±� �ڵ鷯 ��� �޼��� : Hello");
	}

}
