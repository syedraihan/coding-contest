import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//11764 - Jumping Mario
public class UVa11764 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		
		int tc = in.nextInt();
		for (int i=1; i<=tc; i++) {
			int n = in.nextInt();
			int high = 0;
			int low = 0;
			int lastHeight = in.nextInt();
			while(n-- > 1) {
				int height = in.nextInt();
				if (height > lastHeight)
					high++;
				else if (height < lastHeight)
					low++;
				
				lastHeight = height;
			}
			System.out.println("Case " + i + ": " + high + " " + low);
		}
		
		in.close();
	}

}
