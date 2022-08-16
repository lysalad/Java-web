package kr.co.greenart;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestLoginServlet
 */
@WebServlet("/testlogin.do")
public class TestLoginServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect(req.getContextPath() + "/idremember.jsp");
		
		Cookie[] cookies = req.getCookies();
		for (Cookie c1 : cookies) {
			if (c1.getName().equals("login")) {
				req.getRequestDispatcher("testlogin.jsp").forward(req, resp);
			}
		}
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// req.setCharacterEncoding("utf-8");

		// 근데 쿠키를 새로만들면되는게아니고 만들어진 쿠키를 받아와야할거같은데 ,,, ?
		// 아니다 로그인 했을때의 새 쿠키를 만들자 킹진호가 그렇게함
	
			}
			
		
		
	}

