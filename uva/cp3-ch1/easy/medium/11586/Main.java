import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//11586 - Train Tracks
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        int tc = in.nextInt();
        in.nextLine();
        while (tc-- > 0) {
            String[] parts = in.nextLine().split(" ");
            int right = 0;
            int left = 0;
            int partCount = 0;
            for (int i=0; i<parts.length; i++) {
                if (parts[i].length() == 2) {
                    partCount++;
                    right += parts[i].charAt(0) == 'M' ? 1 : -1;
                    left += parts[i].charAt(1) == 'M' ? 1 : -1;
                }
            }

            System.out.println(partCount == 1 ? "NO LOOP" : right + left == 0 ? "LOOP" : "NO LOOP");
        }

        in.close();
    }
}
