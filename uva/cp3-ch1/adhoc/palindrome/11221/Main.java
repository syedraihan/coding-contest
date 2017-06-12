import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//11221 - Magic square palindromes.
public class Main {
    public static void main(String[] main) throws IOException {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        in.nextLine();
        for (int tc = 1; tc <= T; tc++) {
            System.out.println("Case #" + tc + ":");

            String line = in.nextLine();

            StringBuffer sb = new StringBuffer();
            for (int i=0; i<line.length(); i++) {
                char c = line.charAt(i);
                if (Character.isLetter(c))
                    sb.append(c);
            }

            String word = sb.toString();
            int n = (int)Math.sqrt(word.length());
            Boolean noMagic = false;

            if (n * n != word.length()) {
                // Start from the (1,1) cell, move right
                noMagic = true;
            } else {
                char[][] matrix = new char[n][n];

                for (int row=0; row<n; row++)
                    for (int col=0; col<n; col++)
                        matrix[row][col] = word.charAt(row * n + col);

                // Start from the (1,1) cell, move down
                for (int col=0; col<n; col++) {
                    for (int row = 0; row < n; row++) {
                        if (matrix[row][col] != matrix[col][row]) {
                            noMagic = true;
                            break;
                        }
                    }
                    if (noMagic)
                        break;
                }

                // Start from the (K,K) cell, move left
                for (int col=0; col<n; col++) {
                    for (int row=0; row<n/2; row++) {
                        if (matrix[row][col] != matrix[n - 1 - row][n-1-col]) {
                            noMagic = true;
                            break;
                        }
                    }
                    if (noMagic)
                        break;
                }
            }

            System.out.println(noMagic ? "No magic :(" : n);
        }

        in.close();
    }
}
