// Codeforces Round #292 (Div. 2)
// A. Drazil and Date
// http://codeforces.com/problemset/problem/515/A

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int l = in.nextInt();

        int min = Math.abs(a) + Math.abs(b);

        if (min == l) {
            System.out.println("Yes");
        } else if (l > min && (l - min) % 2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


        in.close();
    }

}
