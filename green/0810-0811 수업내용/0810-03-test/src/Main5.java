import java.util.regex.Pattern;

public class Main5 {
	public static void main(String[] args) {
		
		
//		Pattern p = Pattern.compile("{a-zA-Z"});
		// ���� �Ȱ��� ǥ���� \\w
		// {}���� ���̰��� �´�.
		// 3, �̷��� �����ϸ� 3�� �̻�
		// 0, �̷��� �ϸ� ��� �ȴٴ� ��
		// \\w+�� 1�̻�
		// \\w?�� 0�̰ų� 1
		// \\w*�� 0 �̻�
		// \w ����
		// \d ����
		// \s ����
		Pattern p = Pattern.compile("\\w{3,}");
	}
}
