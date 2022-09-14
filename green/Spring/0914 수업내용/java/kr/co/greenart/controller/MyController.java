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
		logger.info("사용자의 요청을 로깅합니다.");
		return "myview";
	}
	
	@GetMapping("/{var}")
	public String  myPathVar(@PathVariable String var) {
		logger.info("사용자의 요청을 로깅합니다.");
		return "myview";
	}
	
	@GetMapping("/burn")
	public String burnAttr(HttpSession session) {
		logger.info("사용자의 요청을 로깅합니다.");
		session.setAttribute("burn", "읽고 삭제하시오");
		return "myview";
	}
	
	// 반복되는 작업을 단순화 시키기
	// 필터는 요청 주소에 대한 handlerServlet이 동작하기 전에 동작.
	// handler, controller가 동작하기 전 후로, 동작할 수 있는 인터셉터를 만들기.
	// >>>>>>>>>> MyInterceptor.java 파일참고.
	
	@GetMapping("/null")
	public String nullExcep() {
		throw new NullPointerException("임의로 발생시킨 널 예외");
	}
}
