package hello;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// 이렇게 쉽게 servlet을 만들수도 있따!

@WebServlet(name = "testMethodServlet"
			, urlPatterns = "/testMethod"
			, initParams = @WebInitParam(name = "name1", value = "value")
			, loadOnStartup = 1)

public class TestMethodServlet extends HttpServlet{
	
	// ...?
	// config는 설정값이 들어가 있는 생성자...? 객체 ...?
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		System.out.println("서블릿 생성할 때 호출됩니다.");
		System.out.println("ServletConfig 객체는 설정한 init param에 접근할 수 있습니다.");
		System.out.println(config.getInitParameter("name1"));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		req.getRequestDispatcher("hello.jsp").forward(req, resp);
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		// 두 가지 방법 중 하나를 사용한다.
//		doGet(req, resp);
		
		// 에러코드인데 지원하지 않는다는 말이다. 이걸 띄워준다.
		resp.setStatus(405);
	
	}
	
}
