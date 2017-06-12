import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//11799 - Horror Dash
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);

		int tc = in.nextInt();
		in.nextLine();
		for (int i=1; i<=tc; i++) {
			String[] line = in.nextLine().split(" ");
			int max = 0;
			for (int j=0; j<line.length; j++) {
				int n = Integer.parseInt(line[j]);
				if (n > max)
					max = n;
			}
			System.out.println("Case " + i + ": " + max);
		}
		
		in.close();
	}
}
