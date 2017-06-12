// Codeforces Round #293 (Div. 2)
// A. Vitaly and Strings
// http://codeforces.com/problemset/problem/518/A

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        String t = in.nextLine();

        char[] chars = s.toCharArray();
        for (int i=chars.length-1; i>=0; i--) {
            chars[i]++;
            if (chars[i] <= 'z') {
                break;
            } else {
                chars[i] = 'a';
            }
        }
        String a = new String(chars);
        if (a.compareTo(t) < 0) {
            System.out.print(a);
        } else {
            System.out.println("No such string");
        }

        in.close();
    }
}
