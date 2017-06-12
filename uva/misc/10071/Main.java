import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//10071 - Back to High School Physics
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			System.out.println(in.nextInt() * in.nextInt() * 2);
		}
		
		in.close();
	}

}
