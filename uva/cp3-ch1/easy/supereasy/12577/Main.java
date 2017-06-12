import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//12577 - Hajj-e-Akbar
public class UVa12577 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner in = new Scanner(System.in);

		int i = 0;
		while (true) {
			String line = in.nextLine().trim();
			if (line.equals("*"))
				break;
			
			System.out.println("Case " + (++i) + ": " + (line.equals("Hajj") ? "Hajj-e-Akbar" : "Hajj-e-Asghar"));
		}
		
		in.close();
	}
}
