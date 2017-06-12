import java.io.*;
import java.util.Scanner;

public class ProblemA {

    public static void main(String[] args) throws IOException {
        //Scanner in = new Scanner(System.in);
	Scanner in = new Scanner(new File("a.in"));

        int T = in.nextInt();

        for (int tt=1; tt<=T; tt++) {
            String s = in.next();
            String result = "" + s.charAt(0);
            for (int j=1; j<s.length(); j++) {
                char c = s.charAt(j);
                if (c >= result.charAt(0))
                    result = c + result;
                else
                    result = result + c;
            }

            System.out.println("Case #" + tt + ": " + result);
        }

        in.close();
    }
}
