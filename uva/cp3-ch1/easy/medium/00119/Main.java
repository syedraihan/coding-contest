import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

//119 - Greedy Gift Givers
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);

		int tc = 0;
		while (in.hasNext()) {
			int n = in.nextInt();
			in.nextLine();
			String[] line = in.nextLine().split(" ");
			HashMap<String, Integer> bals = new HashMap<String, Integer>();
			for (int i=0; i<n; i++) {
				bals.put(line[i], 0);
			}
			for (int i=0; i<n; i++) {
				String giver = in.next();
				int amount = in.nextInt();
				int count = in.nextInt();
				for (int j=0; j<count; j++) {
					String target = in.next();
					bals.put(target, bals.get(target) + (amount / count));
					bals.put(giver, bals.get(giver) - (amount / count));
				}
			}
			
			if (tc++ > 0)
				System.out.println();
			
			for (int i=0; i<n; i++) { 
				System.out.println(line[i] + " " + bals.get(line[i]));
			}
		}
		in.close();
	}

}
