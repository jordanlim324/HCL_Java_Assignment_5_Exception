
public class Day5_Q03 {
	public class AgeLessZeroException {

	}
	/*
	 * 3. Write a custom exception and throw it using the throw keyword
	 * and throws.
	 */
	public static void main(String[] args) {
		try {
			validAge (-1);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void validAge(int age) throws InvalidAgeException {
		if(age < 0) {
			throw new InvalidAgeException("Not a valid age.");
		}
	}
}




