import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 10550 - Combination Lock
public class Main {

	static int clockWise(int a, int b) {
		if (a == b) return 0;
		
		if (a > b)
			return a - b;
		else
			return a + (40 - b);
	}

	static int counterClockWise(int a, int b) {
		if (a == b) return 0;
		
		if (b > a)
			return b - a;
		else
			return (40 - a) + b;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		
		while (true) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int d = in.nextInt();
			
			if (a+b+c+d == 0)
				break;
						
			System.out.println(1080 + 9 * (clockWise(a, b) + counterClockWise(b, c) + clockWise(c, d)));
		}
		
		in.close();
	}

}
