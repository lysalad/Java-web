package member.command;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.service.DuplicatedIdException;
import member.service.JoinRequest;
import member.service.JoinService;
import mvc.command.CommandHandler;

//531���� CommandHandler�� ����ž� �մϴ�
//���ϱ� 589�ʿ��� �������� CommandHandler, NullHandler, ControllerUsingURI�� �� ���°� ��������???? �� ����ž� �մϴ� ȭ����~!!!
public class JoinHandler implements CommandHandler {

	private static final String FORM_VIEW = "/WEB-INF/view/joinForm.jsp";
	private JoinService joinService = new JoinService();
	
	// ��û��� �ϴ� �޼ҵ�
	// � ������� ��û�ϴ��� Ȯ��(������Ʈ�� ���)�ؼ� �ű⿡ �°� ������ ���ش�.

	
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) {
		if (req.getMethod().equalsIgnoreCase("GET")) {
			return processForm(req, res);
			
		} else if (req.getMethod().equalsIgnoreCase("POST")) {
			
			return processSubmit(req, res);
			
		} else {
				// �������� ���� ������� ��û�ϸ� �����ֵ��� �Ѵ�.
			res.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
			return null;
		}
	}
	
	// � ��Ʈ�� Ư������ �����ϴµ�, view������ ��ġ�̴�.
	private String processForm(HttpServletRequest req, HttpServletResponse res) {
		return FORM_VIEW;
	}

	private String processSubmit(HttpServletRequest req, HttpServletResponse res) {
		// �Է°��� ������ �Է°��� Ȯ���� �� �ִ� �͵� �� �ִ�.
		// ������ �� ��ȿ����� ������ �ʴ´�.
		// �� ������߸� �� �� �ִ�.
		JoinRequest joinReq = new JoinRequest();
		joinReq.setId(req.getParameter("id"));
		joinReq.setName(req.getParameter("name"));
		joinReq.setPassword(req.getParameter("password"));
		joinReq.setConfirmPassword(req.getParameter("confirmPassword"));
		
		Map<String, Boolean> errors = new HashMap<>();
		req.setAttribute("errors", errors);
		
		joinReq.validate(errors);
		
		if (!errors.isEmpty()) {
			return FORM_VIEW;
		}
		
		try {
			joinService.join(joinReq);
			return "/WEB-INF/view/joinSuccess.jsp";
		} catch (DuplicatedIdException e) {
			errors.put("duplicateId", Boolean.TRUE);
			return FORM_VIEW;
		}
	}

}