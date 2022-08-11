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
		
		// 그냥 보려고 적어놓음
		System.out.println("사용자의 요청 발생~");
		
		String firstName = req.getParameter("firstname");
		String lastName = req.getParameter("lastname");
		String age = req.getParameter("age");
		String email = req.getParameter("email");
		
		
		PersonValidator validator = new PersonValidator();
		// 많은 에러들 한 맵에 집어넣기
		Map<String, String> errors = new HashMap<String, String>();
	
		errors.putAll(validator.isValidName(firstName));
		errors.putAll(validator.isValidName(lastName));
		errors.putAll(validator.isValidAge(age));
		errors.putAll(validator.isValidEmail(email));
	
		// 맵에 담은 걸  다시 보여주기 위한 조건 걸어주기
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
		
		/* // 여기서부터
// ------------------------------------------------------------------------------------------------
		// 이런걸 추가하려면 어떻게 해야하지?
		// 입력값이 유호한가?
		// 모든 값은 필수!
		// 이름, 성 10자
		// 나이 정수
		// 이메일 고유 50자		
		
		// 잘못된 페이지 입력일때 사용자에게 뭐라고 말할지 ???
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
		// 여기까지를 분리시키면 좀 덜 복잡해지지 않을까? 클래스를 만들어서?
		// 만들어봅시다.
		
		// 여기에는 컨텍스트의 루트 주소가 들어가야한다.
		// 목록도 같이 보낼 수 있다.
		resp.sendRedirect(req.getContextPath() + "/list");
	}

}
