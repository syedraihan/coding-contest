// Codeforces Round #296 (Div. 2)
// B. Error Correct System
// http://codeforces.com/contest/527/problem/B

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        int[][] alpha = new int[26][26];

        int len = in.nextInt(); in.nextLine();
        char[] s = in.next().toCharArray();
        char[] t = in.next().toCharArray();
        in.close();

        int dist = 0;
        for(int i=0; i<len; i++) {
            dist += (s[i] != t[i] ? 1 : 0);
            alpha[s[i] - 'a'][t[i] - 'a'] = i + 1;
        }

        for(int i=0; i<26; i++)
            for (int j=i+1; j<26; j++) {
                if (alpha[i][j] > 0 && alpha[j][i] > 0) {
                    System.out.println(dist - 2);
                    System.out.print(alpha[i][j] + " " + alpha[j][i]);
                    return;
                }
            }

        for(int i=0; i<26; i++)
            for(int j=0; j<26; j++)
                for(int k=0; k<26; k++) {
                    if(alpha[i][j] > 0 && alpha[j][k] > 0 && i != j && j != k) {
                        System.out.println(dist-1);
                        System.out.println(alpha[i][j] + " " + alpha[j][k]);
                        return;
                    }
                }

        System.out.println(dist);
        System.out.println("-1 -1");
    }
}