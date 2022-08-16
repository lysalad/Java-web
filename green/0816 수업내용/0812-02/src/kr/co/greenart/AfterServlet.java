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
**���� !!
������ �󿡼� ��Ű�� ���� �� �ִ� ��׷��� ������ ��Ű�� �����ϴ� �� ���� �� ������� ���� �� �ִ�!! �� Ŭ���̾�Ʈ�� ����ϴ� ��Ű ���� ������ ����ϵ��� ����!!�� ���� (session)

 

### ���� (Session)

: ������ ����ϴ� ��. 

Ŭ���̾�Ʈ�� ������ �����ߴٰ� ������ ���´�. ������ Ŭ���̾�Ʈ�� ���� �� ���� Ŭ���̾�Ʈ��� ���� ��� �Ǻ��ұ�???�� cookie�� ���� Ŭ���̾�Ʈ�� ���� �Ǻ��Ѵ�!!
Ư���� ��Ű ���� �ִ��� ���� ���� �Ǻ��Ͽ� ó�� �����ϴ� Ŭ���̾�Ʈ���� �ƴ��� �Ǻ��ϰ�, ó�� ������ Ŭ���̾�Ʈ���� Ư���� ��Ű ���� �ο��Ѵ�. 
������ �� ��Ű ���� �Ǻ��Ͽ� Ŭ���̾�Ʈ�� Ư���ϰ� �ȴ�.

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
			// ����ڿ��� �α����϶�� �ȳ��� ���ش�.
			resp.sendRedirect("./idremember.jsp");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}

