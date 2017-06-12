// Codeforces Round #295 (Div. 2)
// A. Pangram
// http://codeforces.com/contest/520/problem/A

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();
        char[] s = in.next().toCharArray();

        int[] count = new int[26];
        for (int i = 0; i < n; i++) {
            count[Character.toLowerCase(s[i]) - 'a']++;
        }
        Boolean ok = true;
        for (int i = 0; i < 26; i++) {
            if (count[i] == 0) {
                ok = false;
                break;
            }
        }

        System.out.println(ok ? "YES" : "NO");

        in.close();
    }
}