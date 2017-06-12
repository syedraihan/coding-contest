import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 11547 - Automatic Answer
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		for (int i=0; i<T; i++) {
			int a = in.nextInt();
			int result = (int)Math.abs(((((a * 567)/9 + 7492) * 5 - 498) % 100 ) / 10);
			System.out.println(result);
		}
		
		in.close();
	}
}
