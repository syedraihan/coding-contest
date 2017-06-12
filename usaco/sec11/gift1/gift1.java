/*
ID: me45
LANG: JAVA
PROG: gift1
*/
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

// Same as UVa 119
public class gift1 {
    public static void main (String [] args) throws IOException {
        Scanner in = new Scanner(new File("gift1.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));

        int n = in.nextInt();
        in.nextLine();
        String[] line = new String[n];
        HashMap<String, Integer> bals = new HashMap<String, Integer>();
        for (int i=0; i<n; i++) {
            line[i] = in.next();
            bals.put(line[i], 0);
        }

        while (in.hasNext()) {
            String giver = in.next();
            int amount = in.nextInt();
            int count = in.nextInt();

            for (int j=0; j<count; j++) {
                String target = in.next();
                bals.put(target, bals.get(target) + (amount / count));
                bals.put(giver, bals.get(giver) - (amount / count));
            }
        }

        for (int i=0; i<n; i++) {
            out.println(line[i] + " " + bals.get(line[i]));
        }

        in.close();
        out.close();
        System.exit(0);
    }
}
