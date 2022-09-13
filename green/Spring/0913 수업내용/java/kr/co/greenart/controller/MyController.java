package kr.co.greenart.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/my")
public class MyController {
	private static final Logger logger = LoggerFactory.getLogger(MyController.class);
	
	@GetMapping
	public String myView() {
		logger.info("사용자의 요청을 로깅합니다");
		return "myview";
	}
	
	@GetMapping("/{var}")
	public String myPathVar(@PathVariable String var) {
		logger.info("사용자의 요청을 로깅합니다");
		return "myview";
	}
	
	@GetMapping("/burn")
	public String burnAttr(HttpSession session) {
		logger.info("사용자의 요청을 로깅합니다");
		session.setAttribute("burn", "읽고 삭제하시오");
		return "myview";
		
		// 컨트롤러 전에 해야하는 작업이 있다면, 필터를 넣어도 되지만
		// 매핑을 할때 전에 한 단계를 더 넣어주는 방법도 있다.
		// 뷰가 만들어지기 전 후 개입을 위해 핸들러인터텝터를 만들어준다.
	}
	
	@GetMapping("/null")
	public String nullExcep() {
		throw new NullPointerException("임의로 발생시킨 널 예외");
	}
}

	
	

