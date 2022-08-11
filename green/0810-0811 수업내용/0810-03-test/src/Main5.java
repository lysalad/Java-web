import java.util.regex.Pattern;

public class Main5 {
	public static void main(String[] args) {
		
		
//		Pattern p = Pattern.compile("{a-zA-Z"});
		// 위와 똑같은 표현이 \\w
		// {}에는 길이값이 온다.
		// 3, 이렇게 생략하면 3자 이상
		// 0, 이렇게 하면 없어도 된다는 말
		// \\w+는 1이상
		// \\w?는 0이거나 1
		// \\w*는 0 이상
		// \w 문자
		// \d 숫자
		// \s 공백
		Pattern p = Pattern.compile("\\w{3,}");
	}
}
