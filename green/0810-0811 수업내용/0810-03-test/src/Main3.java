import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {
	public static void main(String[] args) {
		// ����� �Ǿ��ִ� ���ڸ� ã��ʹٸ� ?
		String line = "123 He234llo. 39 Wor4ld! 57";
		// [] �� ����, {} �� ������ ������ �������ִ� �� : ���� �ּұ��� �ڴ� �ִ����
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
