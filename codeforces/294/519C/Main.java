// Codeforces Round #294 (Div. 2)
// C. A and B and Team Training
// http://codeforces.com/contest/519/problem/C

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int n = in.nextInt();

        int count = 0;
        while (x+n >= 3 && x>0 && n>0) {
            count++;
            if (n > x) {
                x--;        // Form Team A  (1 exp, 2 new)
                n -= 2;
            } else {        // Form Team B (2 exp, 1 new)
                x -= 2;
                n--;
            }
        }
        System.out.println(count);
        in.close();
    }
}