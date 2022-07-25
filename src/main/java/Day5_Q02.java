
public class Day5_Q02 {
	/*
	 * 2. Write an example for un-checked exception, and handle it using
	 * try-catch blocks.
	 */
	public static void main(String[] args) {
		
		try {
			int x = 40;
			int y = 0;
			
			int z = x/y;
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
