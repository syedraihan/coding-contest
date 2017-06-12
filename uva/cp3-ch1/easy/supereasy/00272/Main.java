import java.util.*;
import java.io.*;

// 272 - TEX Quotes
public class Main {

	static void print(String s) {
		System.out.print(s);
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		
		boolean flip = true;
		while (in.hasNextLine()) {
			String str = in.nextLine();
			int start = 0;
			while (true) {
				int end = str.indexOf("\"", start);
				if (end != -1) {
					print(str.substring(start, end));
					print(flip ? "``" : "''");
					flip = !flip;
				} else {
					print(str.substring(start, str.length()));
					break;
				}
				start = end + 1;
			}
			print("\n");
		}
		
		in.close();
	}
}
