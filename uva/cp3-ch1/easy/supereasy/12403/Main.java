import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//12403 - Save Setu
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);

		int T = in.nextInt();
		int donation = 0;
		
		for(int i=0; i<=T; i++) {
			String[] tokens = in.nextLine().split(" ");
			if (tokens[0].equals("donate"))
				donation += Integer.parseInt(tokens[1]);
			else if (tokens[0].equals("report"))
				System.out.println(donation);
		}
		
		in.close();
	}
}
