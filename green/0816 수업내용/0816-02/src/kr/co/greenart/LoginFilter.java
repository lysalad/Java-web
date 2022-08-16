package kr.co.greenart;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


// ���Ͱ� ���� ��
// ����Ŵ� �����̶� ����ϰԻ���
// �������̽��� �޾Ƽ�, �갡 ���� ������ �ϴµ� ??
// ������ ���� ���� �α����� �ƴ��� �ȵƴ����� Ȯ���Ѵ�.
public class LoginFilter implements Filter {
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		// ������ ��û ��ü�� �ٷ����
		System.out.println("doFilter ��!!");
		
		System.out.println("���� ���� Ȯ���մϴ�.");
		HttpSession session = ((HttpServletRequest) req).getSession();
		Object loginid = session.getAttribute("loginid");
		
		if (loginid != null) {
			// ���� �帧
			chain.doFilter(req, resp);
		} else {
			System.out.println("�α��� ���� ���� ����.");
//			resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//			req.getRequestDispatcher("needlogin.jsp").forward(req, resp);
			((HttpServletResponse) resp).sendError(HttpServletResponse.SC_UNAUTHORIZED);
		}
		// ������ ��û�� ó���ϰ� ���� ������ ��
		System.out.println("doFilter ��!!");
	}
}



