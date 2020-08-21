
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class TestContextListener implements ServletContextListener {

    public TestContextListener() { }

    //�����ʰ� ����Ǵ� �޼ҵ�
    public void contextInitialized(ServletContextEvent arg0)  { //�ʱ�ȭ
    	ServletContext ctx = arg0.getServletContext();
    	
    	// Book ��ü�� ����� application scope�� ����
    	Book mybook = new Book("�ڹ������α׷���","�̹���",20000,"�ֵ���ũ");
    	ctx.setAttribute("book", mybook);
    	System.out.println("TextContextListener ���۵�...");
    	
    }
    
    public void contextDestroyed(ServletContextEvent sce)  { 
         
    }

	
	
}
