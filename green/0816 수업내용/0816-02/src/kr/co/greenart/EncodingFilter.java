package kr.co.greenart;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

// ���Ⱑ ���Ͷ� ������ �ʿ��Ѱ͸� �޾ƾ��ϴµ� ��� �� �޾Ƶ� ��� X(/*) �� ���� ������ ���ڵ�
// �׷��� �̸��� ���ڵ� ����
@WebFilter(filterName = "EncodingFilter", urlPatterns = "/*"
			, initParams = @WebInitParam(name = "encoding", value = "UTF-8"))
public class EncodingFilter implements Filter {
	private String encoding;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		encoding = filterConfig.getInitParameter("encoding");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setCharacterEncoding(encoding);
		response.setCharacterEncoding(encoding);
		
		chain.doFilter(request, response);
	}
}

