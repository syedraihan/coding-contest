import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 12279 - Emoogle Balance
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		
		int i = 0;
		while (true) {
			int N = in.nextInt();
			if (N == 0) break;
			
			int bal = 0;
			for(int n=0; n<N; n++) {
				int num = in.nextInt();				
				if (num == 0) 
					bal--; 
				else 
					bal++;
			}			
			System.out.println("Case " + (++i) + ": " + bal);
		}
		
		in.close();
	}
}
