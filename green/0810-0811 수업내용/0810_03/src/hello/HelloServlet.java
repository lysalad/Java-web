package hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	// �ʵ�(���°�)�� ������ �Ǹ� ���� ���� ����ڰ� Servlet�� ���� ���� ��, ���°��� Ȯ���ϱⰡ ��ƴ�. ����ڸ��� ���°��� �ٲ�� �����̴�.!!!!!
	// ���°��� �ְ� Servlet�� ����� �̿뿡 �ſ� ū ������� ����.
	private int some = 10;
	
	public HelloServlet() {
		super();
		System.out.println("��� ���� �����ڴ� ���� ȣ��ǳ���?!");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// hello.jsp�ʹ� �ٸ� hello �Դϴ�.!!!!!! web.xml���� hello�ּҸ� �ְ� �װ� ã�� ���µ� ���εȰ��� �˾�ä�� �������ذ���~
		// �� servlet�� �ڹ� Ŭ�����̱� ������, �ּҸ� �ϳ� ����� �༭ ������ �����ϰ� ���� ��. 
		//JSP�� Servlet�̳� �ᱹ�� �Ȱ���. => classȭ �ǰ� instanceȭ �Ǿ� �ᱹ html�� ����ڿ��� ������ �����Ѵ�.
		some++;
		PrintWriter pw = resp.getWriter();
		pw.println(req.getRequestURI());
		pw.flush();
		System.out.println("�ʵ尪: " + some);
	}
	
}