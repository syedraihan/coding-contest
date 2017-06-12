import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//10424 - Love Calculator
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
            char[] p1 = in.nextLine().toLowerCase().toCharArray();
            char[] p2 = in.nextLine().toLowerCase().toCharArray();

            int v1 = getDigitValue(getValue(p1));
            int v2 = getDigitValue(getValue(p2));

            if (v1 == 0 && v2 == 0)
                System.out.println();
            else {
                double percent = v1 < v2 ? (v1 * 100.00 / v2) : (v2 * 100.00 / v1);
                System.out.printf("%.2f %%\n", percent);
            }
        }
		in.close();
	}

    static int getValue(char[] chars) {
        int value = 0;
        for (int i=0; i<chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z')
                value += chars[i] - 'a' + 1;
        }

        return value;
    }

    static int getDigitValue(int n) {
        if (n < 10)
            return n;

        int value = 0;
        char[] digits = Integer.toString(n).toCharArray();
        for (int i=0; i<digits.length; i++) {
            value += digits[i] - '0';
        }

        return getDigitValue(value);
    }
}
