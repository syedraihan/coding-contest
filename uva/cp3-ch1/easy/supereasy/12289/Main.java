import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 12289 - One-Two-Three
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for (int i=0; i<T; i++) {

			String line = in.next().trim();
			int result = 0;
			
			if (line.length() == 5) 
				result = 3;
			else {
				char[] chars = line.toCharArray();
				if ((chars[0] == 'o' && chars[1] == 'n') ||
				    (chars[0] == 'o' && chars[2] == 'e') ||
				    (chars[1] == 'n' && chars[2] == 'e'))
					result = 1;
				else
					result = 2;
			}
				
			System.out.println(result);
		}
		
		in.close();
	}
}
