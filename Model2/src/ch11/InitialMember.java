package ch11;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InitialMember implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		ServletContext context = sce.getServletContext();
		ArrayList<Member> datas = new ArrayList<Member>();
		
		// JSTL ������ ���� 0~7������ ���� �����͸� ����
		for(int i=0;i<8;i++) {
			Member data = new Member("���ڹ�"+i, "test"+i+"@test.net");
			datas.add(data);
		}
		
		// email �� ���� 2�� ���� ������ �߰�
		datas.add(new Member("ȫ�浿", null));
		datas.add(new Member("��浿", null));
		
		// application scope�� members �� member ��ü ����
		context.setAttribute("members", datas);// 10���� ȸ��
		context.setAttribute("member", new Member());// ȫ�浿
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}
	
	

	
}
