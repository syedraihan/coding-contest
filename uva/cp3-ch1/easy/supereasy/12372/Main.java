import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//12372 - Packing for Holiday
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for (int i=0; i<T; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			
			System.out.println("Case " + (i+1) + ": " + (a <= 20 && b <= 20 && c <= 20 ? "good" : "bad"));
		}
		
		in.close();
	}
}
