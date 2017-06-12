import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//621 - Secret Research
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for (int i=0; i<T; i++) {
			String s = in.next();
			if (s.equals("1") || s.equals("4") || s.equals("78"))
				System.out.println("+");
			else if (s.endsWith("35"))
				System.out.println("-");
			else if (s.startsWith("9") && s.endsWith("4"))
				System.out.println("*");
			else if (s.startsWith("190"))
				System.out.println("?");
		}
		
		in.close();
	}

}
