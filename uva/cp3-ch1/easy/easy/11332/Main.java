import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//11332 - Summing Digits
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		
		while (true) {
			int n = in.nextInt();
			if (n == 0)
				break;
			
			System.out.println(evaluate(n));
		}
		
		in.close();
	}
	
	static int evaluate(int n) {
		int sum = sumDigits(n);
		
		if (sum < 10)
			return sum;
		else
			return evaluate(sum);
	}
	
	static int sumDigits(int n) {
		int sum = 0;
		int num = n;

		while (num > 0) {
			sum += (num % 10);
			num = (num - (num % 10)) / 10;
		}
		
		return sum;
	}

}
