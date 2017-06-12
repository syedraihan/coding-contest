// Codeforces Round #297 (Div. 2)
// A. Vitaliy and Pie
// http://codeforces.com/contest/525/problem/A

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); in.nextLine();
        char[] data = in.next().toCharArray();
        int[] keys = new int[26];
        int count = 0;

        for (int i=0; i<n-1; i++) {
            int key = data[i*2] - 'a';
            int lock = data[i*2 + 1] - 'A';

            keys[key]++;
            if (keys[lock] > 0)
                keys[lock]--;
            else
                count++;
        }

        System.out.println(count);

        in.close();
    }
}