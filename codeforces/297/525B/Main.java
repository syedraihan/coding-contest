// Codeforces Round #297 (Div. 2)
// B. Pasha and String
// http://codeforces.com/contest/525/problem/B

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        char[] s = (" " + in.next()).toCharArray();
        int n = s.length - 1;

        int[] a = new int[n/2+1];
        int m = in.nextInt();
        while (m-- > 0)
            a[in.nextInt()]++;
        for (int i=1; i<=n/2; i++)
            a[i] += a[i-1];

        for (int i=1; i<=n/2; i++) {
            if (a[i] % 2 != 0) {
                char t = s[i];
                s[i] = s[n-i+1];
                s[n-i+1] = t;
            }
        }
        System.out.println((new String(s)).substring(1));

        in.close();
    }
}