import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main6 {
	public static void main(String[] args) {
		String line = "(abc, 123) | (de, 6) | (qwer, 15)";
		
		// �Ϲ� ����()�� �������� ǥ���ϱ� ���� \\�� ����ߴ�.
		// �׷��� ����� ���ؼ� �Ϲ� ()�� ���� �߶󳽴�.
		// ���� ��ü�� �׷����� ���Ѵٸ�? ("\\((\\w+, \\d+)\\)") => �̰� (1)
		// Pattern p = Pattern.compile("\\([a-zA-Z]+, [0-9]+\\)");
		
		
		Pattern p = Pattern.compile("\\(([a-zA-Z]+), ([0-9]+)\\)");
		Matcher m = p.matcher(line);
		System.out.println(p);
		System.out.println(m);
		
		while (m.find()) {
			// (1) (������, ����) ������ �׷� 1�� ���´�. ����� group1�� �ϸ� �ȴ�.
			System.out.println(m.group(1));
			// �̰� (������) �׷�1�� (����) �׷� 2���� ����Ѵ�.
			System.out.println(m.group(2));
		}
	}
}

