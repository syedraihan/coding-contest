// Codeforces Round #308 (Div. 2)
// A. Vanya and Table
// http://codeforces.com/contest/552/problem/A

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] coord = new int[n][4];

        int sum = 0;
        for (int i=0; i<n; i++) {
            coord[i][0] = in.nextInt();
            coord[i][1] = in.nextInt();
            coord[i][2] = in.nextInt();
            coord[i][3] = in.nextInt();
        }

        for (int x = 1; x <= 100; x++)
            for (int y = 1; y <= 100; y++) {
                for (int i=0; i<n; i++) {
                    int x1 = coord[i][0];
                    int y1 = coord[i][1];
                    int x2 = coord[i][2];
                    int y2 = coord[i][3];
                    if (x >= x1 && x <= x2 && y >= y1 && y <= y2) {
                        sum++;
                    }
                }
            }

        System.out.println(sum);

        in.close();
    }
}