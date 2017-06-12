import java.io.*;
import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		//Scanner in = new Scanner(new File("a.in"));

		int T = in.nextInt();

		int target = 0+1+2+3+4+5+6+7+8+9;
		int lastNumber = 0;
		for (int tt=1; tt<=T; tt++) {
			int N = in.nextInt();
			int[] digits = new int[10];
			int total = 0;
			int i = 1;
			while (true && N > 0) {
				lastNumber = N * i;
				char[] number = ("" + lastNumber).toCharArray();
				for (int j=0; j<number.length; j++) {
					int digit = number[j] - 48;
					if (digits[digit] == 0) {
						digits[digit]++;
						total += digit;
					}
				}
				if (total == target && digits[0] > 0) break;
				i++;
			}

			System.out.println("Case #" + tt + ": " + (total != target ? "INSOMNIA" : lastNumber));
		}
		
		in.close();
	}
}
