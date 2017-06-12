/*
ID: me45
LANG: JAVA
PROG: ride
*/
import java.io.*;
import java.util.*;

class ride {
    public static void main (String [] args) throws IOException {
        Scanner in = new Scanner(new File("ride.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));

        out.println(eval(in.next()) == eval(in.next()) ? "GO" : "STAY");

        in.close();
        out.close();
        System.exit(0);
    }

    static long eval(String name) {
        char[] chars = name.toCharArray();
        long val = 1;
        for(int i=0; i<chars.length; i++) {
            val *= (chars[i] - 'A' + 1);
        }
        return val % 47;
    }
}