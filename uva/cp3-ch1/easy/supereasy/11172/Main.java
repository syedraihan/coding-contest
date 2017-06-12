import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 11172 - Relational Operator
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		for (int i=0; i<T; i++) {
			long n1 = in.nextLong();
			long n2 = in.nextLong();
			
			if (n1==n2)
				System.out.println("=");
			else if (n1>n2)
				System.out.println(">");
			else if (n1<n2)
				System.out.println("<");			
		}
		
		in.close();		
	}

}
