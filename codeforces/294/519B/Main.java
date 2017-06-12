// Codeforces Round #294 (Div. 2)
// B. A and B and Compilation Errors
// http://codeforces.com/contest/519/problem/B

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i=0; i<n; i++) {
            a += in.nextInt();
        }
        for (int i=0; i<n-1; i++) {
            b += in.nextInt();
        }
        for (int i=0; i<n-2; i++) {
            c += in.nextInt();
        }

        System.out.println(a-b);
        System.out.println(b-c);

        in.close();
    }
}