// Codeforces Round #302 (Div. 2)
// A. Set of Strings
// http://codeforces.com/contest/544/problem/A

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); in.nextLine();
        String s = in.next();

        int[] pos = new int[n];
        int[] uniqueChars = new int[26];
        int found = 0;
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (uniqueChars[c - 'a'] == 0) {
                uniqueChars[c - 'a']++;
                pos[found] = i;
                if (++found == n) break;
            }
        }

        if (found >= n) {
            System.out.println("YES");
            for (int i=0; i<n; i++) {
                int beginIndex = pos[i];
                int endIndex = i+1 < n ? pos[i+1] : s.length();
                System.out.println(s.substring(beginIndex, endIndex));
            }
        } else
            System.out.println("NO");

        in.close();
    }
}