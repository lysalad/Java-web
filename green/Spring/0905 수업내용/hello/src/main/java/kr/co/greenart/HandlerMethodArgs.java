package kr.co.greenart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/handle")
public class HandlerMethodArgs {
	@GetMapping("/cookie")
	// 쿠키값도 살펴볼 수 있다. 쿠키도 이름으로 바로 값을 꺼내올 수 있다.
	public @ResponseBody String args(@CookieValue(name ="JSESSIONID" )String jsessionid) {
		return jsessionid;
	}
	
	@GetMapping("/header")
	public @ResponseBody String head(@RequestHeader("Accept") String accept) {
		return accept;
	}
	
	// 주소를 변수처럼 사용하기 위해 사용자의 요청에 따라 주소창에 적은걸 path1과 path2에 나눠서 넣어준다.
	// 요청의 값을 쿠키값 경로값 헤더값으로 전달받는게 가능하다 이말인데 모르겠다 나는 말을 못알아듣고있어
	
	@GetMapping("/{path1}/{path2}")
	public @ResponseBody String Paths(@PathVariable String path1, @PathVariable String path2) {
		return path1 + path2;
	}
}
