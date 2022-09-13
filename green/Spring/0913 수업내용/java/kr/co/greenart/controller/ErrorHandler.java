package kr.co.greenart.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// 처리과정이 복잡해지는데 그 중에 발생하는 에러를 한번에 처리하기 위한 핸들러이다.
@ControllerAdvice
public class ErrorHandler {
	// 핸들링 메소드를 똑같이 작성할 수 있는데 에러의 예외를 핸들러 메소드를 작성한다.
	// value에 어느 에러를 처리할것인지 명시한다.
	@ExceptionHandler(value = NullPointerException.class)
	public String nullExcep(Model model, NullPointerException ex) {
		model.addAttribute("error", "서버에서 오류가 발생했습니다." + ex.getMessage());
		return "errorpage";
	}
}
