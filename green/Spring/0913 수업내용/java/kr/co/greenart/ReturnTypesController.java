package kr.co.greenart;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/returns")
public class ReturnTypesController {
	@GetMapping("/viewname")
	public String viewname() {
		return "hello";
	}
	
	@GetMapping("/respbody")
	@ResponseBody // 위치는 String 앞에 가도 괜찮다.
	public String body() {
		return "body 내용";
	}
	
	@GetMapping("/mv")
	public ModelAndView mv() {
		
		// 이렇게 생성해도 되고, 파라미터 안에 넣어도 된다.
		ModelAndView mv = new ModelAndView();
		mv.addObject("print", "모델엔뷰 객체로 설정");
		mv.setViewName("printresult");
		return mv;
	}
	
	@GetMapping("/respentity")
	public ResponseEntity<String> entity() {
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_TYPE, "")
				.body("바디 내용");
		
//		String body = "바디내용입니다";
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("Content-Type", "text/plain; charset=utf-8");
//		ResponseEntity<String> en = new ResponseEntity<>(body, headers, HttpStatus.OK);
//		return en;
	}
	
	@GetMapping("/red")
	public String redirect() {
		// / 뒤에 경로명을 적어준다.
		return "redirect:/";
	}
}
