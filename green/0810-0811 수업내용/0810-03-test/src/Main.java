import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 정규표현식
// 특정 문자열에 대해서 내가 원하는 값만 찾아내거나, 맞는지 확인할 수 있는 서식
public class Main {
	public static void main(String[] args) {
		String line = "This is a book.";
		// 정규표현식에는 패턴이라는 객체가 나온다.
		// 문자열로 정규표현식을 표현("is")
		// 정규표현식을 쓸 단어를 넣어주는 객체
		Pattern p = Pattern.compile("is");

		// 매쳐라는 객체도 있는데 매처는 또 패턴을 받아온다.
		// 랜덤 쓰는거랑 비슷허네
		// 검사하고자 하는 문자열을 넣어주는 객체
		Matcher m = p.matcher(line);

		// 매처에게 루킹앳을 호출가능
		// 일단 false가 나온다.
		// looking at은 line과 시작부분이 같은지를 물어본다.
		// 시작이 일치하면 true가 나온다.
		System.out.println(m.lookingAt());

		boolean find = m.find();
		System.out.println(find);

		// 이렇게 하면 일치하는 시작점과 끝점을 찾아준다.
		// This is a book과 일치를 시작하는 부분이 2, 끝나는 부분이 4
		if (find) {
			System.out.println(m.start()); // 2
			System.out.println(m.end()); // 4
		}

		find = m.find();

		System.out.println(find);
		// 한 번 더 하면? -> 5 7
		if (find) {
			System.out.println(m.start());
			System.out.println(m.end());
		}

		find = m.find();

		System.out.println(find);
		// 또 한 번 더 하면? -> false
		if (find) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println("읎음");
		}
	}
}
