package kr.co.greenart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// HttpServlet: �޼ҵ� ������ �� ���ϴ� ���·� ���� �� �� �ְ� ������� �������̵�~
public class CountryServlet extends HttpServlet {

	// service�޼ҵ�� ���� �۵��ǳ���? : Ư���� �ּҸ� �ݳ��ϸ� service �޼ҵ带 ȣ���ؼ� �۵�~
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ��û �ּҿ� ��û �帧 ����
		req.setAttribute("title", "�������� ������ ����");
		req.setAttribute("message", "�������� ������ �޼���");
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