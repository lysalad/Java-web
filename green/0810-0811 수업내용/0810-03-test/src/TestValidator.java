import person.PersonValidator;

public class TestValidator {
	public static void main(String[] args) {
		PersonValidator v = new PersonValidator();
		v.isValidName("ÀÌ¿¹½½");
	}
}
