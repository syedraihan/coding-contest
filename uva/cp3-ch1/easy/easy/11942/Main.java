import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//11942 - Lumberjack Sequencing
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);

		System.out.println("Lumberjacks:");
		int tc = in.nextInt();
		while (tc-- > 0) {
			boolean ordered = true;
			int a = in.nextInt();
			int b = in.nextInt();
			boolean inc = (b > a);
			for (int i=0; i<8; i++) {
				int c = in.nextInt();
				if ((inc && c < b) || (!inc && c > b)) {
					ordered = false;
				}
				b = c;
			}
			System.out.println(ordered ? "Ordered" : "Unordered");
		}
		
		in.close();
	}

}
