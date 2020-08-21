

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("*.jsp")
public class Encfilter implements Filter {
	private String encoding;
    
    public Encfilter() {
    }
	
	public void destroy() {
	}

	// ���� ó�� �޼ҵ�
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// ĳ���� ���ڵ� ������ ���� ��� ����
		if(request.getCharacterEncoding()==null) {
			request.setCharacterEncoding(encoding);
			chain.doFilter(request, response);
		}		
	}
	
	
	public void init(FilterConfig fConfig) throws ServletException {
		this.encoding = fConfig.getServletContext().getInitParameter("encoding");
	}

}
