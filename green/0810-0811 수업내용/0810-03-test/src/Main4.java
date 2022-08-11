import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main4 {
	public static void main(String[] args) {
		
		String line1 = "lowercase";
		String line2 = "UPPERCASE";
		String line3 = "1q2w3e";
		
//		Pattern p = Pattern.compile("[A-Z]{9}");
//		Matcher m = p.matcher(line2);
//		
//		// matches는 머지 ????		
//		System.out.println(m.matches());
		
		
		 // 숫자랑 영소문자가 섞여있는 데서 찾아보기
//		Pattern p = Pattern.compile("[0-9a-z]{6}");
//		Matcher m = p.matcher(line3);
//		System.out.println(m.matches());
//		
		// 아이디는 영소문자와 숫자로 구성, 최소6자 최대 10자(영문자로 시작)
//		String id = "doony123";
//		Pattern p = Pattern.compile("[a-z][0-9]{10}");
//		Matcher m = p.matcher(id);
//		
//		System.out.println(m.matches());
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String id = scan.nextLine();
		
		Pattern p = Pattern.compile("[a-z][a-z0-9]{5,9}");
		Matcher m = p.matcher(id);
		
		if (m.matches()) {
			System.out.println("유효한 id");
		} else {
			System.out.println("올바르지 않은 입력값입니다.");
		}
		
		// 올바른 전화번호 (010-####-####)
		
		String regex = "010-[0-9]{4}-[0-9]{4}";
		Pattern p1 = Pattern.compile(regex);

		System.out.println(p1.matcher("010-1234-5678").matches());
		System.out.println(p1.matcher("010-1234-aaaa").matches());
		System.out.println(p1.matcher("010-@#$%-5678").matches());
		System.out.println(p1.matcher("01012345678").matches());
		System.out.println(p1.matcher("011-123-5678").matches());
		
	}
}
