import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//12554 - A Special "Happy Birthday" Song!!!
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);

		String[] song = "Happy birthday to you Happy birthday to you Happy birthday to Rujia Happy birthday to you".split(" ");
		
		int n = in.nextInt();
		in.nextLine();
		
		String[] names = new String[n];
		for (int i=0; i<n; i++) 
			names[i] = in.nextLine();
		
		for (int i=0; i<(int)Math.ceil((double)n/16.0) * 16; i++) {
			System.out.println(names[i % names.length] + ": " + song[i % song.length]);
		}
		
		in.close();
	}

}
