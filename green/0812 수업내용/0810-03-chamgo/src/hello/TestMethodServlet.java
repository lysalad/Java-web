package hello;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// �̷��� ���� servlet�� ������� �ֵ�!

@WebServlet(name = "testMethodServlet"
			, urlPatterns = "/testMethod"
			, initParams = @WebInitParam(name = "name1", value = "value")
			, loadOnStartup = 1)

public class TestMethodServlet extends HttpServlet{
	
	// ...?
	// config�� �������� �� �ִ� ������...? ��ü ...?
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		System.out.println("���� ������ �� ȣ��˴ϴ�.");
		System.out.println("ServletConfig ��ü�� ������ init param�� ������ �� �ֽ��ϴ�.");
		System.out.println(config.getInitParameter("name1"));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		req.getRequestDispatcher("hello.jsp").forward(req, resp);
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		// �� ���� ��� �� �ϳ��� ����Ѵ�.
//		doGet(req, resp);
		
		// �����ڵ��ε� �������� �ʴ´ٴ� ���̴�. �̰� ����ش�.
		resp.setStatus(405);
	
	}
	
}
