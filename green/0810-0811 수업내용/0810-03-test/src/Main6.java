import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main6 {
	public static void main(String[] args) {
		String line = "(abc, 123) | (de, 6) | (qwer, 15)";
		
		// 일반 문자()는 문자임을 표현하기 위해 \\를 사용했다.
		// 그룹을 만들기 위해서 일반 ()로 값을 잘라낸다.
		// 만약 전체를 그룹으로 감싼다면? ("\\((\\w+, \\d+)\\)") => 이게 (1)
		// Pattern p = Pattern.compile("\\([a-zA-Z]+, [0-9]+\\)");
		
		
		Pattern p = Pattern.compile("\\(([a-zA-Z]+), ([0-9]+)\\)");
		Matcher m = p.matcher(line);
		System.out.println(p);
		System.out.println(m);
		
		while (m.find()) {
			// (1) (영문자, 숫자) 형태의 그룹 1만 나온다. 출력은 group1만 하면 된다.
			System.out.println(m.group(1));
			// 이건 (영문자) 그룹1과 (숫자) 그룹 2까지 출력한다.
			System.out.println(m.group(2));
		}
	}
}

