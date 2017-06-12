// Codeforces Round #293 (Div. 2)
// B. Tanya and Postcard
// http://codeforces.com/problemset/problem/518/B

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        String t = in.nextLine();

        char[] done = s.toCharArray();
        int[] available = new int[256];
        for (int i=0; i<t.length(); i++) {
            available[t.charAt(i)]++;
        }

        int yay = 0;
        int whoops = 0;
        for (int i=0; i<done.length; i++) {
            char c = done[i];
            if (available[c] > 0) {
                yay++;
                available[c]--;
                done[i] = '.';
            }
        }
        for (int i=0; i<done.length; i++) {
            char c = done[i];
            if (c != '.') {
                c = Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c);
                if (available[c] > 0) {
                    whoops++;
                    available[c]--;
                    done[i] = '.';
                }
            }
        }

        System.out.println(yay + " " + whoops);
        in.close();
    }
}
