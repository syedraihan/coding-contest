import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//401 - Palindromes
public class Main {
	public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        String s1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        String s2 = "A   3  HIL JM O   2TUVWXY51SE Z  8 ";
        Map<Character, Character> map = new HashMap<Character, Character>();
        for (int i=0; i<s1.length(); i++)
            map.put(s1.charAt(i), s2.charAt(i));

        while (in.hasNext()) {
            String word = in.nextLine();

            Boolean isPalindrome = true;
            Boolean isMirror = true;

            int len = word.length();
            for (int i=0; i<=len/2; i++) {      // i<len/2 is OK for Palindrome but not for Mirror!
                char c1 = word.charAt(i);
                char r1 = map.get(c1);
                char c2 = word.charAt(len-1-i);

                if (c1 != c2)  isPalindrome = false;
                if(r1 == ' ' || r1 != c2) isMirror = false;
            }

            System.out.print(word);
            if (isMirror && isPalindrome)
                out(" -- is a mirrored palindrome." );
            else if (!isPalindrome & isMirror)
                out(" -- is a mirrored string." );
            else if (isPalindrome && !isMirror)
                out(" -- is a regular palindrome.");
            else
                out(" -- is not a palindrome." );

            System.out.println();
        }

        in.close();
    }

    static void out(String s) {
        System.out.println(s);
    }

}
