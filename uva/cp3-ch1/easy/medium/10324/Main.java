import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//10324 - Zeros and Ones
// Use of Tricky Algorithm!
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		
		int tc = 1;
		while (in.hasNext()) {
			System.out.println("Case " + tc++ + ":");

			char[] data = in.next().toCharArray();
			int[] sum = new int[data.length];
			
			sum[0] = 0;
			for(int i = 1; i<data.length; i++) {
				if (data[i] == data[i-1])
					sum[i] = sum[i-1];
				else
					sum[i] = sum[i-1] + 1;
			}
			
			int queries = in.nextInt();
			while (queries-- > 0) {
				int i = in.nextInt();
				int j = in.nextInt();
				System.out.println(sum[i] == sum[j] ? "Yes" : "No");
			}
		}
		
		in.close();
	}

}
