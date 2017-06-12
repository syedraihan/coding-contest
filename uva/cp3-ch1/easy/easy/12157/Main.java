import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//12157 - Tariff Plan
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);

		int tc = in.nextInt();
		for (int i=1; i<=tc; i++) {
			int n = in.nextInt();
			int mile = 0;
			int juice = 0;
			
			while (n-- > 0) {
				int m = in.nextInt();	
				mile +=  (m + 30) / 30;
				juice +=  (m + 60) / 60;
			}
			
			mile *= 10;
			juice *= 15;
			
			System.out.print("Case " + i + ": ");
			if (mile < juice)
				System.out.print("Mile " + mile);
			else if (juice < mile)
				System.out.print("Juice " + juice);
			else
				System.out.print("Mile Juice " + mile);
			
			System.out.println();
		}
		in.close();
	}

}
