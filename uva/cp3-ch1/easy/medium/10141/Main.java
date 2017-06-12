import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//10141 - Request for Proposal
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);

		int tc = 1;
		while (true) {
			int n = in.nextInt();
			int p = in.nextInt();
			
			if (n == 0 && p == 0)
				break;
			
			in.nextLine();
			for (int i=0; i<n; i++) in.nextLine();
			
			String winner = "";
			double winPrice = Double.POSITIVE_INFINITY;
			double winCompliance = 0;
			
			for (int i=0; i<p; i++) {
				String company = in.nextLine();
				double price = in.nextDouble();
				int metReq = in.nextInt();
				double compliance =  (double)metReq / (double)n;
				
				if (compliance > winCompliance) {
					winner = company;
					winCompliance = compliance;
					winPrice = price;
				}
				else if (compliance == winCompliance) {
					if (price < winPrice) {
						winner = company;
						winCompliance = compliance;
						winPrice = price;
					}
				}
				in.nextLine();
				for (int j=0; j<metReq; j++) in.nextLine();				
			}
			
			if (tc > 1)
				System.out.println();
			
			System.out.println("RFP #" + tc++);
			System.out.println(winner);
		}
		
		in.close();		
	}
}
