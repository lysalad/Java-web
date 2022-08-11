package hello;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import person.Person;
import person.PersonDAO;
import person.PersonValidator;

public class PersonServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getCharacterEncoding());
		req.setCharacterEncoding("utf-8");
		
		// �׳� ������ �������
		System.out.println("������� ��û �߻�~");
		
		String firstName = req.getParameter("firstname");
		String lastName = req.getParameter("lastname");
		String age = req.getParameter("age");
		String email = req.getParameter("email");
		
		
		PersonValidator validator = new PersonValidator();
		// ���� ������ �� �ʿ� ����ֱ�
		Map<String, String> errors = new HashMap<String, String>();
	
		errors.putAll(validator.isValidName(firstName));
		errors.putAll(validator.isValidName(lastName));
		errors.putAll(validator.isValidAge(age));
		errors.putAll(validator.isValidEmail(email));
	
		// �ʿ� ���� ��  �ٽ� �����ֱ� ���� ���� �ɾ��ֱ�
		if (errors.size() > 0) {
			req.setAttribute("errors", errors);
			req.getRequestDispatcher("form.jsp").forward(req, resp);
		} else {
			PersonDAO dao = new PersonDAO();
			try {
				dao.insert(new Person(firstName, lastName, Integer.valueOf(age), email));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			resp.sendRedirect(req.getContextPath() + "/list");
		}
		
		/* // ���⼭����
// ------------------------------------------------------------------------------------------------
		// �̷��� �߰��Ϸ��� ��� �ؾ�����?
		// �Է°��� ��ȣ�Ѱ�?
		// ��� ���� �ʼ�!
		// �̸�, �� 10��
		// ���� ����
		// �̸��� ���� 50��		
		
		// �߸��� ������ �Է��϶� ����ڿ��� ����� ������ ???
		PersonDAO dao = new PersonDAO();
		
		try {
			dao.insert(new Person(firstName, lastName, Integer.valueOf(number), email));
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		*/
// ------------------------------------------------------------------------------------------------
		// ��������� �и���Ű�� �� �� ���������� ������? Ŭ������ ����?
		// �����ô�.
		
		// ���⿡�� ���ؽ�Ʈ�� ��Ʈ �ּҰ� �����Ѵ�.
		// ��ϵ� ���� ���� �� �ִ�.
		resp.sendRedirect(req.getContextPath() + "/list");
	}

}
