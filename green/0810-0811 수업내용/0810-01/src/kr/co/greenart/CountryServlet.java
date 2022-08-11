package kr.co.greenart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// HttpServlet: 메소드 재정의 후 원하는 형태로 동작 할 수 있게 해줘야함 오버라이드~
public class CountryServlet extends HttpServlet {

	// service메소드는 언제 작동되나요? : 특정한 주소를 반납하면 service 메소드를 호출해서 작동~
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 요청 주소에 요청 흐름 제어
		req.setAttribute("title", "서블릿에서 설정한 제목");
		req.setAttribute("message", "서블릿에서 설정한 메세지");
		req.getRequestDispatcher("messageoutput.jsp").forward(req, resp);

		
		
		
		/*
		PrintWriter pw = resp.getWriter();
//		pw.println("Hello Servlet");
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head><meta charset='urf-8'/></head>");
		pw.println("<body><h1>hello servlet</h1></body>");
		pw.flush();
	*/
		
	}
}