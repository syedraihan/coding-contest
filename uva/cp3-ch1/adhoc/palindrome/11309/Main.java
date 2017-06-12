import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//11309 - Counting Chaos
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
		int tc = in.nextInt();
		while (tc-- > 0) {
			String line = in.next();

			int current = Integer.parseInt(line.substring(0, 2)) * 60 + Integer.parseInt(line.substring(3, 5));
			for (int t=1; t<=24*60; t++) {
				int time = current + t;
                if (time >= 24*60)
                    time %= (24*60);

                int h = time / 60;
                int m = time % 60;

				String s = h > 0 ? (Integer.toString(h) + withZero(Integer.toString(m))) : Integer.toString(m);
				if (isPalindrome(s)) {
					System.out.println(withZero(Integer.toString(h)) + ":" + withZero(Integer.toString(m)));
					break;
				}
			} 
		}

        in.close();
    }

    static String withZero(String s) {
        return ("00" + s).substring(s.length());
    }

	static Boolean isPalindrome(String s) {

		int len = s.length();
		for (int i=0; i<len/2; i++) {
			if (s.charAt(i) != s.charAt(len-1-i)) {
                return false;
            }
		}

		return true;
	}
}
