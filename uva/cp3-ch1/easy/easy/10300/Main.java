import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//10300 - Ecological Premium
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();		
		for (int i=0; i<T; i++) {
			int farmers = in.nextInt();
			int amount = 0;
			for (int j=0; j<farmers; j++) {
				int area = in.nextInt();
				in.nextInt();
				int factor = in.nextInt();
				amount += (area * factor);
			}
			System.out.println(amount);
		}
		
		in.close();
	}

}
