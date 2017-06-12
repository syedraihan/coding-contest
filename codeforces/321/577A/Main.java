// Codeforces Round #321 (Div. 2)
// A. Multiplication Table
// http://codeforces.com/contest/577/problem/A

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int x = in.nextInt();

        int count = 0;
        for (int i=1; i<=n; i++) {
            if (x % i == 0) {
                if (x / i <= n) count++;
            }
        }

        System.out.println(count);

        in.close();
    }
}