import java.io.FileNotFoundException;
import java.io.FileReader;

public class Day5_Q01 {
	/*
	 * 1. Write an example for checked exception.
	 */
	public static void main(String[] args) {
		
		try {
			FileReader file = new FileReader ("C:\\Users\\jordan.lim\\Documents\\Java Training\\Github Repos\\HCL_Java_Assignment_5_Exception\\src\\main\\java\\Food.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
