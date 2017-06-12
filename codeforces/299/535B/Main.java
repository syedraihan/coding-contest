// Codeforces Round #299 (Div. 2)
// B. Tavas and SaDDas
// http://codeforces.com/contest/535/problem/B

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int index = 0;
        int pos = 0;
        int numDigits = 0;
        while (n > 0) {
            numDigits++;
            int lastDigit = n % 10;

            int digit =  lastDigit == 4 ? 0 : 1;
            index += (int)Math.pow(2, pos) * digit;
            n = n/10;
            pos++;
        }
        System.out.println(index + (int)Math.pow(2, numDigits) - 1);

        in.close();
    }
}