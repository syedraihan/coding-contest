import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//11507 - Bender B. Rodríguez Problem
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int L = in.nextInt();
            if (L == 0)
                break;
            L--;

            String cur = "+x";
            for (int i = 0; i < L; i++) {
                String cmd = in.next();
                if (!cmd.equals("No"))
                if (cur.equals("+x")) {
                    cur = cmd.toString();
                }
                else if (cur.equals("-x")) {
                    if (cmd.charAt(0) == '-') {
                        cur = "+" + cmd.charAt(1);
                    } else {
                        cur = "-" + cmd.charAt(1);
                    }
                }
                else if (cur.equals("+y")) {
                    if (cmd.equals("+y")) {
                        cur = "-x";
                    } else if (cmd.equals("-y")) {
                        cur = "+x";
                    }
                }
                else if (cur.equals("-y")) {
                    if (cmd.equals("+y")) {
                        cur = "+x";
                    } else if (cmd.equals("-y")) {
                        cur = "-x";
                    }
                }
                else if (cur.equals("+z")) {
                    if (cmd.equals("+z")) {
                        cur = "-x";
                    } else if (cmd.equals("-z")) {
                        cur = "+x";
                    }
                }
                else if (cur.equals("-z")) {
                    if (cmd.equals("+z")) {
                        cur = "+x";
                    } else if (cmd.equals("-z")) {
                        cur = "-x";
                    }
                }
            }
            System.out.println(cur);
        }

        in.close();
    }
}

