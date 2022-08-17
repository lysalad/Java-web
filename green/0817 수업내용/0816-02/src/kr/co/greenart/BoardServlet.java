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
										// 이름 그대로 로그를 만드는 곳
	private final static Logger logger = LoggerFactory.getLogger(BoardServlet.class);
	
	private BoardService service;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		service = new BoardService(new BoardDAO());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("사용자가 GET방식의 요청을 하였습니다. (게시판 목록)");
		
		// 기본적으로 sysout과 같은데, 형식을 설정할 수 있다.
		// 시간, 어떤 패키지인지, 중요도 등을 표현할 수 있다.
// 		slf4j의 형식은 -> FATAL / ERROR / WARN / INFO / DEBUG
		logger.info("logger을 통해 메시지를 남깁니다.");
		logger.info("사용자가 get을 요청했습니다. > 게시판 보기");
		
		
		

		
//		System.out.println("로그인 확인되었습니다. 게시판 목록으로 foward합니다.");
		
		List<BoardArticle> articles = service.게시글목록보기서비스();
		req.setAttribute("articles", articles);
		
		req.getRequestDispatcher("/WEB-INF/articles.jsp").forward(req, resp);
	}
}

		