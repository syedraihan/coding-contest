import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//661 - Blowing Fuses
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);

		int seq = 0;
		while (true) {
			seq++;
			int n = in.nextInt();
			int m = in.nextInt();
			int c = in.nextInt();
			
			if (n == 0 && m == 0 && c == 0) break;
			
			int[] consumptions = new int[n];
			boolean[] states = new boolean[n];			
			for (int i=0; i<n; i++) {
				consumptions[i] = in.nextInt();
				states[i] = false;
			}
			
			int load = 0;
			int maxLoad = 0;
			for (int i=0; i<m; i++) {
				int op = in.nextInt() - 1;
				states[op] = !states[op];				
				load += consumptions[op] * (states[op] ? 1 : -1);
				if (load > maxLoad)
					maxLoad = load;				
			}
			
			System.out.println("Sequence " + seq);
			if (maxLoad > c) 
				System.out.println("Fuse was blown.");
			else {
				System.out.println("Fuse was not blown.");
				System.out.println("Maximal power consumption was " + maxLoad + " amperes.");				
			}
			System.out.println();	
		}
		in.close();
	}

}
