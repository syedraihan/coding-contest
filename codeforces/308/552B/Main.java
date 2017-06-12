// Codeforces Round #308 (Div. 2)
// B. Vanya and Books
// http://codeforces.com/contest/552/problem/B

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        long n = in.nextInt();
        long numDigits = String.valueOf(n).length();

        long ans = 0;
        long num = 0;
        for (long pos = 0; pos < numDigits - 1; pos++) {
            long d = 9 * (long)Math.pow(10, pos);
            ans += d * (pos+1);
            num += d;
        }
        ans += (n - num) * numDigits;

        System.out.println(ans);

        in.close();
    }
}