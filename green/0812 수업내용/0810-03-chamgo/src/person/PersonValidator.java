package person;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonValidator {
	// �̸�, �� 10��
	public Map<String, String> isValidName(String name) {
		Map<String, String> map = new HashMap<>();
		if (name != null) {
			int length = name.length();
			if (length == 0 || length > 10) {
				map.put("nameLength", "�̸��� ���ڼ��� 1 ~ 10�ڿ��� �մϴ�.");
			}
			
			if (name.contains(" ")) {
				map.put("nameSpace", "�̸��� ������ ������ �� �����ϴ�.");
			}
			
			Pattern p = Pattern.compile("[a-zA-Z��-�R]+");
			Matcher m = p.matcher(name);
			
			if (!m.matches()) {
				map.put("nameChar", "�̸��� �ѱ� �Ǵ� �����ڿ����մϴ�.");
			}
		} else {
			map.put("nameNull", "�̸��� �Է����ּ���.");
		}
		return map;
	}
	
	// ���� ����
	public Map<String, String> isValidAge(String age) {
		Map<String, String> map = new HashMap<>();
		
		if (age != null) {
			Pattern p = Pattern.compile("\\d+");
			Matcher m = p.matcher(age);
			
			if (!m.matches()) {
				map.put("ageFormat", "���̴� ���ڸ� ���˴ϴ�.");
			} else {
				try {
					int num = Integer.valueOf(age);
					if (num < 15 || num > 99) {
						map.put("ageRange", "������ ������ 15 - 99���Դϴ�.");
					}
				} catch (NumberFormatException e) {
					map.put("ageRange", "������ ������ 15 - 99���Դϴ�.");
				}
			}
		} else {
			map.put("ageNull", "���̸� �Է����ּ���.");
		}
		return map;
	}
	
	// �̸��� 50��
	public Map<String, String> isValidEmail(String email) {
		Map<String, String> map = new HashMap<>();
		if (email != null) {
			if (email.length() > 50) {
				map.put("emailLength", "�̸����� �ִ� 50�� �Դϴ�.");
			}

			Pattern p = Pattern.compile("\\w+@\\w+.\\w+");
			Matcher m = p.matcher(email);
			
			if (!m.matches()) {
				map.put("emailFormat", "�̸��� ����� �ùٸ��� �ʽ��ϴ�.");
			}
		} else {
			map.put("emailNull", "�̸����� �Է����ּ���.");
		}
		return map;
	}
}


