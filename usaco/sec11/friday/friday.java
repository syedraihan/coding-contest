import java.io.*;
import java.util.Scanner;

/*
ID: me45
LANG: JAVA
PROG: friday
*/
public class friday {
    public static void main (String [] args) throws IOException {
        Scanner in = new Scanner(new File("friday.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));

        int[] days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] counts = new int[7];

        int N = in.nextInt();
        int dow = 0; // Jan 13 is Sat
        for (int y=1900; y<1900+N; y++) {
            for(int m=0; m<12; m++) {
                counts[dow]++;
                dow = (dow + (m == 1 && isLeap(y) ? 29 : days[m])) % 7;
            }
        }

        for (int w=0; w<6; w++) {
            out.print(counts[w] + " ");
        }
        out.println(counts[6]);

        in.close();
        out.close();
        System.exit(0);
    }

    static Boolean isLeap(int y) {
        return y % (y % 100 == 0 ? 400 : 4) == 0;
    }
}
