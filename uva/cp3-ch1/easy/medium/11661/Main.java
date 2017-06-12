import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//11661 - Burger Time?
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        while (true) {
            int tc = in.nextInt();
            if (tc == 0)
                break;

            char[] data = in.next().toCharArray();
            int distance = data.length+1;

            char cur = '.';
            int curPos = -1;
            for (int i=0; i<data.length; i++) {
                if (data[i] == 'Z') {
                    distance = 0;
                    break;
                } else if (data[i] == 'D' || data[i] == 'R') {   // Found a stop
                    if (curPos != -1) {                          // If last stop was a Drug/Rest
                        if (cur != data[i]) {                    // If they are different
                            if (i-curPos < distance) {
                                distance = i-curPos;
                            }
                        }
                    }
                    cur = data[i]; // Remember
                    curPos = i;
                }
            }

            System.out.println(distance);
        }

        in.close();
    }
}
