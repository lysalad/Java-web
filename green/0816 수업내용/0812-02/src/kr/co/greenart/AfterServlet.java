package kr.co.greenart;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/after")

/*
**문제 !!
브라우저 상에서 쿠키를 만들 수 있다 →그렇기 때문에 쿠키로 접근하는 건 보안 상 취약점이 있을 수 있다!! → 클라이언트가 기억하는 쿠키 말고 서버가 기억하도록 하자!!→ 세션 (session)

 

### 세션 (Session)

: 서버가 기억하는 것. 

클라이언트는 서버에 접속했다가 연결을 끊는다. 무수한 클라이언트의 접속 중 같은 클라이언트라는 것을 어떻게 판별할까???→ cookie로 같은 클라이언트인 것을 판별한다!!
특정한 쿠키 값이 있는지 없는 지를 판별하여 처음 접속하는 클라이언트인지 아닌지 판별하고, 처음 접속한 클라이언트에는 특정한 쿠키 값을 부여한다. 
서버는 그 쿠키 값을 판별하여 클라이언트를 특정하게 된다.

*/



public class AfterServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
		Cookie loginCookie = null;
		if (cookies != null) {
			for (Cookie c : cookies) {
				if (c.getName().equals("loginok")) {
					loginCookie = c;
				}
			}
		}
		
		if (loginCookie != null) {
			req.getRequestDispatcher("/WEB-INF/testlogin.jsp").forward(req, resp);
		} else {
			// 사용자에게 로그인하라고 안내를 해준다.
			resp.sendRedirect("./idremember.jsp");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}

