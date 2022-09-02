package kr.co.greenart;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mapping")
public class MappingController {
	@GetMapping(value = "/??.two", produces = "text/plain; charset=utf-8")
	public @ResponseBody String two() {
		return "두글자 매핑";
	}
	
	@GetMapping("/*.do")
	public @ResponseBody String doURI() {
		return "do로 끝나는 매핑";
	}
	
	// params를 넣으면 파라미터를 넣는ㄱ ㅔ필수가 되므로 그냥 ppp를 하면 안 된다.
	// com이라는 파라미터가 필수로 있어야한다.
	//mapping/ppp?com= 으로 적어주면 다시 나온다.
	
	// 하지만 com=val를 해주면 다시 에러가 나면서 화면 출력이 안 된다.
	@GetMapping(value = "/ppp", params = "com")
											// 파라미터에 값이 없을때 알아서 default라는 값을 집어넣는다.
	public @ResponseBody String ppp(@RequestParam(defaultValue = "default") String com) {
		return "com";
	}
	
	// 이렇게 뭐가 안들어갔을 때 를 줄수도 있따.
//	@GetMapping(value = "/ppp", params != "com")
}
