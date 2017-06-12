import java.io.*;
import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		//Scanner in = new Scanner(new File("b.in"));

		int T = in.nextInt();

		for (int tt=1; tt<=T; tt++) {
			String s = in.next();

			char last = '*';
			int count = 0;
			for (int i=0; i<s.length(); i++) {
				if (s.charAt(i) != last)
					count++;

				last = s.charAt(i);
			}

			if (last == '+') count--;

			System.out.println("Case #" + tt + ": " + count);
		}
		
		in.close();
	}
}
