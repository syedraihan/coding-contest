import java.util.Scanner;

// 1124 - Celebrity jeopardy
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (in.hasNextLine()) {
			String str = in.nextLine();
			System.out.println(str);
		}
		
		in.close();
	}

}
