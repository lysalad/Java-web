import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
	public static void main(String[] args) {
		
		String line = "1 He2llo. 3 Wor4ld! 5";
		
		// "[0-9]"�� ����ǥ�� [] �ȿ� ���� �ϳ��� ���� ������ �������ش�.
		// ���� 0�������� 9 ���̿� �ִ�, ���ڷ� �Ǿ��ִ� ���ڸ� ã���ּ���! ��� ���ϴ� ���̴�.
		// �� ���ھ� ã���ش�. char �����̴�.
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
