import java.io.*;
import java.util.Scanner;
import java.math.BigInteger;

public class ProblemB {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        //Scanner in = new Scanner(new File("b.in"));

        int T = in.nextInt();

        for (int tt=1; tt<=T; tt++) {
            String s = in.next();
            BigInteger n = new BigInteger(s);
            long i = 0;
            while (true) {
                BigInteger test = n.subtract(new BigInteger("" + i));
                String result = test.toString();
                if (isTidy(result)) {
                    System.out.println("Case #" + tt + ": " + result);
                    break;
                } else
                    i++;
            }
        }

        in.close();
    }

    private static boolean isTidy(String n) {
        for (int i=1; i<n.length(); i++) {
            int prevDigit = Character.getNumericValue(n.charAt(i-1));
            int digit = Character.getNumericValue(n.charAt(i));
            if (digit < prevDigit)
                return false;
        }

        return true;
    }
}
