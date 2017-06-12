import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//11683 - Laser Sculpture
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        while (true) {
            int h = in.nextInt();
            int w = in.nextInt();
            if (h == 0 && w == 0)
                break;

            int count = 0;
            int last = in.nextInt();

            for (int i=1; i<w; i++) {
                int height = in.nextInt();
                if (height > last)
                    count += height - last;

                last = height;
            }

            count += h - last;

            System.out.println(count);
        }
        in.close();
    }
}
