package member.command;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.service.DuplicatedIdException;
import member.service.JoinRequest;
import member.service.JoinService;
import mvc.command.CommandHandler;

//531쪽의 CommandHandler를 만드셔야 합니다
//보니깐 589쪽에서 만들라고한 CommandHandler, NullHandler, ControllerUsingURI이 다 없는것 같은데요???? 다 만드셔야 합니다 화이팅~!!!
public class JoinHandler implements CommandHandler {

	private static final String FORM_VIEW = "/WEB-INF/view/joinForm.jsp";
	private JoinService joinService = new JoinService();
	
	// 요청제어를 하는 메소드
	// 어떤 방식으로 요청하는지 확인(리퀘스트의 방식)해서 거기에 맞게 리턴을 해준다.

	
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) {
		if (req.getMethod().equalsIgnoreCase("GET")) {
			return processForm(req, res);
			
		} else if (req.getMethod().equalsIgnoreCase("POST")) {
			
			return processSubmit(req, res);
			
		} else {
				// 구현하지 않은 방식으로 요청하면 보여주도록 한다.
			res.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
			return null;
		}
	}
	
	// 어떤 스트링 특정값을 리턴하는데, view파일의 위치이다.
	private String processForm(HttpServletRequest req, HttpServletResponse res) {
		return FORM_VIEW;
	}

	private String processSubmit(HttpServletRequest req, HttpServletResponse res) {
		// 입력값이 있으면 입력값을 확인할 수 있는 것도 꼭 있다.
		// 하지만 이 유효방식은 보이지 않는다.
		// 꼭 물어봐야만 알 수 있다.
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