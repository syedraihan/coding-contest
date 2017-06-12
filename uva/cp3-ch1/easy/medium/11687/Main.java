import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//11687 - Digits
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        while (true) {
            String x0 = in.nextLine();
            if (x0.equals("END")) break;

            int i = 1;
            while (true) {
                int n = x0.length();
                String x1 = Integer.toString(n);
                if (x1.equals(x0))
                    break;

                i++;
                x0 = x1;
            }
            System.out.println(i);
        }

        in.close();
    }
}
