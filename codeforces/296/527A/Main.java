// Codeforces Round #296 (Div. 2)
// A. Playing with Paper
// http://codeforces.com/contest/527/problem/A

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        long a = in.nextLong();
        long b = in.nextLong();
        long result = 0;

        while (true) {
            if (a == 0 || a == b) break;

            if (b > a) {
                long t = a;
                a = b;
                b = t;
            }

            long n = a / b;
            a -= n * b;
            result +=n;
        }
        System.out.println(result);

        in.close();
    }
}