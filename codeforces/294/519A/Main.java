// Codeforces Round #294 (Div. 2)
// A. A and B and Chess
// http://codeforces.com/contest/519/problem/A

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        int black = 0;
        int white = 0;
        for (int i=0; i<8; i++) {
            char[] a = in.nextLine().toCharArray();
            for (int j=0; j<a.length; j++) {
                char c = a[j];
                if (c != '.') {
                    if (Character.isLowerCase(c))
                        black += getValue(c);
                    else
                        white += getValue(Character.toLowerCase(c));
                }
            }
        }
        if (black > white)
            System.out.println("Black");
        else if (white > black)
            System.out.println("White");
        else
            System.out.println("Draw");

        in.close();
    }

    static int getValue(char c) {
             if (c == 'q') return 9;
        else if (c == 'r') return 5;
        else if (c == 'b') return 3;
        else if (c == 'n') return 3;
        else if (c == 'p') return 1;
        else
            return 0;
    }
}