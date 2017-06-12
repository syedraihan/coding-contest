import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 11044 - Searching for Nessy
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		for (int i=0; i<T; i++) {
			int n = in.nextInt();
			int m = in.nextInt();
			
			int result = ((int)Math.ceil((double)(n-2)/3)) * ((int)Math.ceil((double)(m-2)/3));
			System.out.println(result);
		}
		
		in.close();
	}

}
