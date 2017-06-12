import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//10018 - Reverse and Add
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int tc = in.nextInt();
        while (tc-- >0) {
            long n = in.nextLong();
            int i = 0;
            while (i++ < 1000) {
                n += Integer.parseInt(new StringBuffer(Long.toString(n)).reverse().toString());
                if (isPalindrome(Long.toString(n)))
                    break;
            }
            System.out.println(i + " " + n);
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
