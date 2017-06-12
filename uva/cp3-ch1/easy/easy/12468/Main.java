import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//12468 - Zapping
public class UVa12468 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);

		while (true) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			if (a == -1 && b == -1)
				break;
			
			int n1 = Math.abs(a - b);
			int n2 = 100 - n1;
			
			System.out.println(n1 < n2 ? n1 : n2);
			
		}
		in.close();
	}

}
