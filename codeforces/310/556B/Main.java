// Codeforces Round #310 (Div. 2)
// B. Case of Fake Numbers
// http://codeforces.com/contest/556/problem/B

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] digits = new int[n];
        for (int i=0; i<n; i++) {
            digits[i] = in.nextInt();
        }

        Boolean ok = true;
        Boolean clockwise = true;
        int distance = 0 - digits[0];
        if (distance < 0) distance += n;

        for (int i=1; i<n; i++) {
            clockwise = !clockwise;
            int digitDistance = digits[i];

            if (clockwise) {
                digitDistance =  i - digits[i];
                if (digitDistance < 0) digitDistance += n;
            } else {
                digitDistance = digits[i] - i;
                if (digitDistance < 0) digitDistance += n;
            }

            if (digitDistance != distance) {
                ok = false;
                break;
            }
        }

        System.out.println(ok ? "Yes" : "No");
        in.close();
    }
}