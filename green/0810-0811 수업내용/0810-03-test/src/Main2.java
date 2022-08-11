import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
	public static void main(String[] args) {
		
		String line = "1 He2llo. 3 Wor4ld! 5";
		
		// "[0-9]"가 정규표현 [] 안에 문자 하나에 대한 범위를 설정해준다.
		// 시작 0에서부터 9 사이에 있는, 숫자로 되어있는 문자면 찾아주세요! 라고 말하는 것이다.
		// 한 글자씩 찾아준다. char 단위이다.
		Pattern p = Pattern.compile("[0-9]");
		Matcher m = p.matcher(line);
		
		m.find();
		System.out.println(m.start()); // 0
		
		m.find();
		System.out.println(m.start()); // 4
		
		m.find();
		System.out.println(m.start()); // 10
		
		m.find();
		System.out.println(m.start()); // 15
		
		m.find();
		System.out.println(m.start()); // 20
		
	}
}
