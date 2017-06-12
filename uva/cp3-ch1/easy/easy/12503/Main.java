import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//12503 - Robot Instructions
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);

		int tc = in.nextInt();
		while (tc-- > 0) {
			int n = in.nextInt();
			in.nextLine();
			int position = 0;
			String[] cmds = new String[n];
			for (int i=0; i<n; i++) {
				String s = in.nextLine().trim();
				if (s.startsWith("SAME AS")) {
					int cmdIndex = Integer.parseInt(s.replace("SAME AS ", "")) - 1;
					cmds[i] = cmds[cmdIndex];
				}
				else
					cmds[i] = s;
				
				if (cmds[i].equals("LEFT"))
					position--;
				else if (cmds[i].equals("RIGHT"))
					position++;
			}
			
			System.out.println(position);			
		}
		
		in.close();
	}

}
