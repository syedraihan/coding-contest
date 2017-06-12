// Codeforces Round #297 (Div. 2)
// C. Ilya and Sticks
// http://codeforces.com/contest/525/problem/C

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] l = new int[n];
        for (int i=0; i<n; i++) {
            l[i] = in.nextInt();
        }

        Arrays.sort(l);

        int i=l.length - 1;
        int[] sides = new int[2];
        int count = 0;
        BigInteger tarea = BigInteger.valueOf(0);
        while (i >= 1) {
            if (l[i] - l[i-1] <= 1) {
                sides[count++] = l[i-1];
                if (count == 2) {
                    BigInteger a = BigInteger.valueOf(sides[0]);
                    BigInteger b = BigInteger.valueOf(sides[1]);
                    BigInteger area = a.multiply(b);
                    tarea = tarea.add(area);
                    count = 0;
                }
                i -= 2;
            } else
                i--;
        }

        System.out.println(tarea);

        in.close();
    }
}