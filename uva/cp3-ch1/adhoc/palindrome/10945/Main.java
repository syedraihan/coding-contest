import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//10945 - Mother bear
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

		while (true) {
			String word = in.nextLine();
            if (word.equals("DONE"))
                break;

			int len = word.length() - 1;
			int i = 0;

			Boolean isPalindrome = true;
			while (true) {			    
				while (i < len) {
                    if (Character.isLetter(word.charAt(i)))
                        break;
                    else
                        i++;
                }
				while (len > i) {
                    if (Character.isLetter(word.charAt(len)))
                        break;
                    else
                        len--;
                }

				if (i < len) {
                    char c1 = word.charAt(i++);
                    char c2 = word.charAt(len--);
					if (Character.toUpperCase(c1) != Character.toUpperCase(c2)) {
						isPalindrome = false;
						break;
					}
				} else
                    break;
            }

            System.out.println(isPalindrome ? "You won't be eaten!" : "Uh oh..");
		}

        in.close();
    }

	
}
