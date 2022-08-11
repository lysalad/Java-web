import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {
	public static void main(String[] args) {
		// 덩어리로 되어있는 숫자를 찾고싶다면 ?
		String line = "123 He234llo. 39 Wor4ld! 57";
		// [] 한 글자, {} 한 글자의 범위를 지정해주는 곳 : 앞은 최소길이 뒤는 최대길이
		Pattern p = Pattern.compile("[0-9]{2,3}");
		Matcher m = p.matcher(line);
		
		m.find();
		System.out.println(m.start()); // 0
		System.out.println(m.end()); // 3
		
		m.find();
		System.out.println(m.start()); // 6
		System.out.println(m.end()); // 9
	}
}
