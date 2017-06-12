import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			String line = in.nextLine();

            ArrayList<String> palindromes = new ArrayList<String>();
            for (int i=0; i<line.length(); i++)
			for (int j=i+1; j<=line.length(); j++) {
                String word = line.substring(i, j);
				if (isPalindrome(word)) {
                    if (!palindromes.contains(word))
                        palindromes.add(word);
                }
			}

			System.out.println("The string '" + line + "' contains " + palindromes.size() + " palindromes.");
		}

		in.close();
    }

	static Boolean isPalindrome(String s) {

		int len = s.length();
		for (int i=0; i<len/2; i++) {
			if (s.charAt(i) != s.charAt(len-1-i)) {
                return false;
            }
		}

		return true;
	}
}
