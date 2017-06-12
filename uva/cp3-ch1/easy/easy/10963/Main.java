import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//10963 - The Swallowing Ground
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		for (int i=0; i<T; i++) {
			boolean possible = true;
			int cols = in.nextInt();
			int diff = Math.abs(in.nextInt() - in.nextInt());
			for(int col=1; col<cols; col++) {
				if (diff != Math.abs(in.nextInt() - in.nextInt())) {
					possible = false;	
					// break; if we break, we will get Wrong Answer, since you have to read rest of the row
				}
			}
			System.out.println(possible ? "yes" : "no");
			if (i < T - 1)
				System.out.println();
		}
		
		in.close();
	}

}
