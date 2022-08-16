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

		// �ٵ� ��Ű�� ���θ����Ǵ°Ծƴϰ� ������� ��Ű�� �޾ƿ;��ҰŰ����� ,,, ?
		// �ƴϴ� �α��� �������� �� ��Ű�� ������ ŷ��ȣ�� �׷�����
	
			}
			
		
		
	}

