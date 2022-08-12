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

// addperson.do => get / post
public class PersonServlet extends HttpServlet {
	
	// get은 여기로 온다.
	// 먼지는 몰라도 겟방식에는 무적권 하는게 좋다고 한다..ㅎ 그게 뭔데...
	// 리다이렉트로 제대로 입력할 수 있는 폼으로 보내준다 ...?
	// 어디서......????????????????????????????????????
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.sendRedirect(req.getContextPath() + "/form.jsp");
	}
	
	// do는 여기로 온다.
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		String firstName = req.getParameter("firstname");
		String lastName = req.getParameter("lastname");
		String age = req.getParameter("age");
		String email = req.getParameter("email");
		
		PersonValidator validator = new PersonValidator();
		Map<String, String> errors = new HashMap<String, String>();
		errors.putAll(validator.isValidName(firstName));
		errors.putAll(validator.isValidName(lastName));
		errors.putAll(validator.isValidAge(age));
		errors.putAll(validator.isValidEmail(email));
		
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
	}
}








