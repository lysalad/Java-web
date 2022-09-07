package kr.co.greenart;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// "/print" get 요청을 보내면 -> text 입력 가능한 (view)form.jsp로 foward
// form.jsp submit시 "/print" POST 요청 -> 입력한 text 그대로를 볼 수 있는 (view)print.jsp로 foward

// 두 개의 전송 방식의 이름이 똑같기때문에 위에다가 선언해줄수도 있다.
// 이렇게 하면 알아서 포스트와 겟을 구분한다.
@Controller
@RequestMapping(value = "/print")
public class PrintController {
	
	
	@GetMapping
	public String printForm() {
		return "form";
	}
	
	@PostMapping
	public String printView(HttpServletRequest request, @RequestParam String text, Model model) {
		
		try {
			request.setCharacterEncoding("UTF-8");
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		model.addAttribute("text", text);
		
		return "print";
	}
	
	
	@GetMapping("/sub")
	// @ResponseBody는 view이름을 반환하는게 아니고 그 뒤의 이름을 응답 바디로 보낸다는 말이다.
	// 그래서 출력화면에 /print/sub가 나온다.
	public @ResponseBody String sub() {
		return "/print/sub";

	}
}
