// Codeforces Round #293 (Div. 2)
// C. Anya and Smartphone
// http://codeforces.com/problemset/problem/518/C

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int k  = in.nextInt();

        Map<Integer, Integer> appPos = new HashMap<Integer, Integer>();
        Map<Integer, Integer> posApp = new HashMap<Integer, Integer>();

        for (int i=0; i<n; i++) {
            int app = in.nextInt();
            appPos.put(app, i);
            posApp.put(i, app);
        }

        long count = 0;
        for (int i=0; i<m; i++) {
            int app = in.nextInt();
            int p = appPos.get(app);
            count += (p / k) + 1;

            if (p > 0) {
                int adjacentApp = posApp.get(p-1);

                appPos.put(app, p-1);
                appPos.put(adjacentApp, p);

                posApp.put(p-1, app);
                posApp.put(p, adjacentApp);
            }
        }

        System.out.println(count);
        in.close();
    }
}