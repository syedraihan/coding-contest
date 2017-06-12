// Codeforces Round #292 (Div. 2)
// B. Drazil and His Happy Friends
// http://codeforces.com/contest/515/problem/B

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        Boolean[] boys = new Boolean[n];
        for(int i=0; i<n; i++) boys[i] = false;

        Boolean[] girls = new Boolean[m];
        for(int i=0; i<m; i++) girls[i] = false;

        int happyBoyCount = in.nextInt();
        for (int i=0; i<happyBoyCount; i++) {
            boys[in.nextInt()] = true;
        }

        int happyGirlCount = in.nextInt();
        for (int i=0; i<happyGirlCount; i++) {
            girls[in.nextInt()] = true;
        }

        for (int i=0; i<10000; i++) {
            if (boys[i % n] || girls[i % m]) {
                if (!boys[i % n]) happyBoyCount++;
                if (!girls[i % m]) happyGirlCount++;

                boys[i % n] = true;
                girls[i % m] = true;
            }

            if (happyBoyCount >= n && happyGirlCount >= m)
                break;
        }

        System.out.println(happyBoyCount >= n && happyGirlCount >= m ? "Yes" : "No");
        in.close();
    }

}
