// Codeforces Round #292 (Div. 2)
// C. Drazil and Factorial
// http://codeforces.com/contest/515/problem/C

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        char[] a = in.next().toCharArray();

        int[][] data = {
                { },
                { },
                { 2 },
                { 3 },
                { 3, 2, 2},
                { 5 },
                { 5, 3},
                { 7 },
                { 7, 2, 2, 2},
                { 7, 3, 3, 2 }
        };

        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i=0; i<a.length; i++) {
            if (a[i] != '0' && a[i] != '1') {
                int[] digits = data[a[i] - '0'];
                for (int j=0; j<digits.length; j++) {
                    result.add(digits[j]);
                }
            }
        }
        Integer[] r = result.toArray(new Integer[result.size()]);
        Arrays.sort(r, Collections.reverseOrder());

        for(int i=0; i<r.length; i++) {
            System.out.print(r[i]);
        }
        System.out.println();

        in.close();
    }

}
