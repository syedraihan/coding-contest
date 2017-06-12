import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 10919 - Prerequisites?
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        while (true) {
            int taken = in.nextInt();
            if (taken == 0) break;

            int catagories = in.nextInt();
            Boolean[] catTaken = new Boolean[catagories];

            List<String> coursesTaken = new ArrayList<String>();
            for (int i=0; i<taken; i++)
                coursesTaken.add(in.next());

            for (int i=0; i<catagories; i++) {
                int courses = in.nextInt();
                int required = in.nextInt();

                int count = 0;
                for (int j=0; j<courses; j++) {
                    String course = in.next();
                    if (coursesTaken.contains(course))
                        count++;
                }
                catTaken[i] = count >= required;
            }

            Boolean pass = true;
            for (int i=0; i<catagories; i++) {
                if (!catTaken[i]) {
                    pass = false;
                    break;
                }
            }

            System.out.println(pass ? "yes" : "no");
        }

        in.close();
    }
}

