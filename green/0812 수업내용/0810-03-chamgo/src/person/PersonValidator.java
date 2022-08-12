package person;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonValidator {
	// ÀÌ¸§, ¼º 10ÀÚ
	public Map<String, String> isValidName(String name) {
		Map<String, String> map = new HashMap<>();
		if (name != null) {
			int length = name.length();
			if (length == 0 || length > 10) {
				map.put("nameLength", "ÀÌ¸§ÀÇ ±ÛÀÚ¼ö´Â 1 ~ 10ÀÚ¿©¾ß ÇÕ´Ï´Ù.");
			}
			
			if (name.contains(" ")) {
				map.put("nameSpace", "ÀÌ¸§¿¡ °ø¹éÀ» Æ÷ÇÔÇÒ ¼ö ¾ø½À´Ï´Ù.");
			}
			
			Pattern p = Pattern.compile("[a-zA-Z°¡-ÆR]+");
			Matcher m = p.matcher(name);
			
			if (!m.matches()) {
				map.put("nameChar", "ÀÌ¸§Àº ÇÑ±Û ¶Ç´Â ¿µ¹®ÀÚ¿©¾ßÇÕ´Ï´Ù.");
			}
		} else {
			map.put("nameNull", "ÀÌ¸§À» ÀÔ·ÂÇØÁÖ¼¼¿ä.");
		}
		return map;
	}
	
	// ³ªÀÌ Á¤¼ö
	public Map<String, String> isValidAge(String age) {
		Map<String, String> map = new HashMap<>();
		
		if (age != null) {
			Pattern p = Pattern.compile("\\d+");
			Matcher m = p.matcher(age);
			
			if (!m.matches()) {
				map.put("ageFormat", "³ªÀÌ´Â ¼ıÀÚ¸¸ Çã¿ëµË´Ï´Ù.");
			} else {
				try {
					int num = Integer.valueOf(age);
					if (num < 15 || num > 99) {
						map.put("ageRange", "³ªÀÌÀÇ ¹üÀ§´Â 15 - 99¼¼ÀÔ´Ï´Ù.");
					}
				} catch (NumberFormatException e) {
					map.put("ageRange", "³ªÀÌÀÇ ¹üÀ§´Â 15 - 99¼¼ÀÔ´Ï´Ù.");
				}
			}
		} else {
			map.put("ageNull", "³ªÀÌ¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä.");
		}
		return map;
	}
	
	// ÀÌ¸ŞÀÏ 50ÀÚ
	public Map<String, String> isValidEmail(String email) {
		Map<String, String> map = new HashMap<>();
		if (email != null) {
			if (email.length() > 50) {
				map.put("emailLength", "ÀÌ¸ŞÀÏÀº ÃÖ´ë 50ÀÚ ÀÔ´Ï´Ù.");
			}

			Pattern p = Pattern.compile("\\w+@\\w+.\\w+");
			Matcher m = p.matcher(email);
			
			if (!m.matches()) {
				map.put("emailFormat", "ÀÌ¸ŞÀÏ ¾ç½ÄÀÌ ¿Ã¹Ù¸£Áö ¾Ê½À´Ï´Ù.");
			}
		} else {
			map.put("emailNull", "ÀÌ¸ŞÀÏÀ» ÀÔ·ÂÇØÁÖ¼¼¿ä.");
		}
		return map;
	}
}


