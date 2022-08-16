package kr.co.greenart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/board")
public class BoardServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("����ڰ� GET����� ��û�� �Ͽ����ϴ�. (�Խ��� ���)");
		
		System.out.println("�α��� Ȯ�εǾ����ϴ�. �Խ��� ������� foward�մϴ�.");
		List<String> articles = new ArrayList<>(Arrays.asList("��1", "��2", "��3"));
		req.setAttribute("articles", articles);
		
		req.getRequestDispatcher("/WEB-INF/articles.jsp").forward(req, resp);
	}
}

		