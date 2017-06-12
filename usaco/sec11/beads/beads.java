import java.io.*;
import java.util.Scanner;

/*
ID: me45
LANG: JAVA
PROG: beads
*/
public class beads {
    public static void main (String [] args) throws IOException {
        Scanner in = new Scanner(new File("beads.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));

        int n = in.nextInt();
        String data = in.next();

        int max = 0;
        for (int i=0; i<n; i++) {
            int count = 0;
            char color = 'x';
            boolean switched = false;
            for (int j=0; j<n; j++) {
                char c = data.charAt((i+j) % n);
                if (c != 'w') {             // first non-white
                    if (color == 'x')
                        color = c;          // first color
                    else if (c != color) {  // 2nd color
                        if (!switched) {
                            switched = true;
                            color = c;
                        }
                        else break;         // found a length
                    }
                }
                count++;
            }
            if (count > max) max = count;
        }

        out.println(max);

        in.close();
        out.close();
        System.exit(0);
    }
}
