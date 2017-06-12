// Codeforces Round #299 (Div. 2)
// A. Tavas and Nafas
// http://codeforces.com/contest/535/problem/A

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        String[] ones = new String[] {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String[] oneones = new String[] { "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
        String[] tens = new String[] {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        int n = in.nextInt();

             if (n < 10) out(ones[n]);
        else if (n % 10 == 0) out(tens[n/10]);
        else if (n < 20) out(oneones[n-11]);
        else {
            out(tens[n/10] + "-" + ones[n%10]);
        }

        in.close();
    }

    private static void out(String s) {
        System.out.println(s);
    }
}