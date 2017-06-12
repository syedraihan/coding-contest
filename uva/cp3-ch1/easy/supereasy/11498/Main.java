import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 11498 - Division of Nlogonia
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		
		while (true) {
			int N = in.nextInt();
			if (N==0)
				break;
			
			int x0 = in.nextInt();
			int y0 = in.nextInt();
			
			for (int i=0; i<N; i++) {

				int x = in.nextInt() - x0;
				int y = in.nextInt() - y0;
				
				if (x == 0 || y == 0)
					System.out.println("divisa");				
				else if (x > 0 && y > 0)
					System.out.println("NE");					
				else if (x < 0 && y > 0)
					System.out.println("NO");					
				else if (x > 0 && y < 0)
					System.out.println("SE");
				else if (x < 0 && y < 0)
					System.out.println("SO");
			}
		}
		
		in.close();	
	}

}
