import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//11956 - Brainfuck
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.nextLine();
        for (int tc=1; tc<=N; tc++) {
            int[] memory = new int[100];
            int pointer = 0;
            String cmds = in.nextLine();
            for (int i=0; i<cmds.length(); i++) {
                char cmd = cmds.charAt(i);
                if (cmd == '>') pointer = (pointer + 1) % memory.length;
                else if (cmd == '<') pointer = pointer - 1 >= 0 ? pointer - 1 : memory.length - 1;
                else if (cmd == '+') memory[pointer] = (memory[pointer] + 1) % 256;
                else if (cmd == '-') memory[pointer] = memory[pointer] - 1 >= 0 ? memory[pointer] - 1 : 255;
            }

            System.out.print("Case " + tc + ":");
            for (int i=0; i<memory.length; i++) {
                System.out.print(" " + toHex(memory[i]));
            }
            System.out.println();
        }
        in.close();
    }

    static String toHex(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(n).toUpperCase());
        if (sb.length() < 2) {
            sb.insert(0, '0'); // pad with leading zero if needed
        }
        return sb.toString();
    }
}
