import java.util.regex.Matcher;
import java.util.regex.Pattern;

// ����ǥ����
// Ư�� ���ڿ��� ���ؼ� ���� ���ϴ� ���� ã�Ƴ��ų�, �´��� Ȯ���� �� �ִ� ����
public class Main {
	public static void main(String[] args) {
		String line = "This is a book.";
		// ����ǥ���Ŀ��� �����̶�� ��ü�� ���´�.
		// ���ڿ��� ����ǥ������ ǥ��("is")
		// ����ǥ������ �� �ܾ �־��ִ� ��ü
		Pattern p = Pattern.compile("is");

		// ���Ķ�� ��ü�� �ִµ� ��ó�� �� ������ �޾ƿ´�.
		// ���� ���°Ŷ� ������
		// �˻��ϰ��� �ϴ� ���ڿ��� �־��ִ� ��ü
		Matcher m = p.matcher(line);

		// ��ó���� ��ŷ���� ȣ�Ⱑ��
		// �ϴ� false�� ���´�.
		// looking at�� line�� ���ۺκ��� �������� �����.
		// ������ ��ġ�ϸ� true�� ���´�.
		System.out.println(m.lookingAt());

		boolean find = m.find();
		System.out.println(find);

		// �̷��� �ϸ� ��ġ�ϴ� �������� ������ ã���ش�.
		// This is a book�� ��ġ�� �����ϴ� �κ��� 2, ������ �κ��� 4
		if (find) {
			System.out.println(m.start()); // 2
			System.out.println(m.end()); // 4
		}

		find = m.find();

		System.out.println(find);
		// �� �� �� �ϸ�? -> 5 7
		if (find) {
			System.out.println(m.start());
			System.out.println(m.end());
		}

		find = m.find();

		System.out.println(find);
		// �� �� �� �� �ϸ�? -> false
		if (find) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println("����");
		}
	}
}
