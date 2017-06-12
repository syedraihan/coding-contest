import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//12250 - Language Detection
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		
		int i = 0;
		while (true) {
			String line = in.nextLine();
			if (line.equals("#"))
				break;
			
			System.out.println("Case " + (++i) + ": " + language(line));
		}
		
		in.close();
	}
	
	static String language(String word) {
		     if (word.equals("HELLO")) 			return "ENGLISH";
		else if (word.equals("HOLA")) 			return "SPANISH";
		else if (word.equals("HALLO")) 			return "GERMAN";
		else if (word.equals("BONJOUR")) 		return "FRENCH";
		else if (word.equals("CIAO")) 			return "ITALIAN";
		else if (word.equals("ZDRAVSTVUJTE")) 	return "RUSSIAN";	
		else 									return "UNKNOWN";
	}
}
