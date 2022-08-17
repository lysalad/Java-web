package kr.co.greenart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet("/board")
public class BoardServlet extends HttpServlet {
										// �̸� �״�� �α׸� ����� ��
	private final static Logger logger = LoggerFactory.getLogger(BoardServlet.class);
	
	private BoardService service;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		service = new BoardService(new BoardDAO());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("����ڰ� GET����� ��û�� �Ͽ����ϴ�. (�Խ��� ���)");
		
		// �⺻������ sysout�� ������, ������ ������ �� �ִ�.
		// �ð�, � ��Ű������, �߿䵵 ���� ǥ���� �� �ִ�.
// 		slf4j�� ������ -> FATAL / ERROR / WARN / INFO / DEBUG
		logger.info("logger�� ���� �޽����� ����ϴ�.");
		logger.info("����ڰ� get�� ��û�߽��ϴ�. > �Խ��� ����");
		
		
		

		
//		System.out.println("�α��� Ȯ�εǾ����ϴ�. �Խ��� ������� foward�մϴ�.");
		
		List<BoardArticle> articles = service.�Խñ۸�Ϻ��⼭��();
		req.setAttribute("articles", articles);
		
		req.getRequestDispatcher("/WEB-INF/articles.jsp").forward(req, resp);
	}
}

		