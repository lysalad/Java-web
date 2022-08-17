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


// 필터가 서블릿 전
// 생긴거는 서블릿이랑 비슷하게생김
// 인터페이스를 받아서, 얘가 무슨 역할을 하는데 ??
// 서블렛에 가기 전에 로그인이 됐는지 안됐는지를 확인한다.
public class LoginFilter implements Filter {
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		// 서블릿이 요청 객체를 다루기전
		System.out.println("doFilter 전!!");
		
		System.out.println("세션 값을 확인합니다.");
		HttpSession session = ((HttpServletRequest) req).getSession();
		Object loginid = session.getAttribute("loginid");
		
		if (loginid != null) {
			// 원래 흐름
			chain.doFilter(req, resp);
		} else {
			System.out.println("로그인 되지 않은 유저.");
//			resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//			req.getRequestDispatcher("needlogin.jsp").forward(req, resp);
			((HttpServletResponse) resp).sendError(HttpServletResponse.SC_UNAUTHORIZED);
		}
		// 서블릿이 요청을 처리하고 응답 보내기 전
		System.out.println("doFilter 후!!");
	}
}



