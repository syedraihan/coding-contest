import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//11679 - Sub-prime
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		
		while (true) {
			int banks = in.nextInt();
			int debentures = in.nextInt();
			
			if (banks == 0 && debentures == 0)
				break;
			
			int[] reserves = new int[banks];
			for (int i=0; i<banks; i++) {
				reserves[i] = in.nextInt();
			}
			
			for (int i=0; i<debentures; i++) {
				int debtor = in.nextInt();
				int creditor = in.nextInt();
				int value = in.nextInt();
				
				reserves[debtor - 1] -= value;
				reserves[creditor - 1] += value;
			}
			
			boolean ok = true;
			for (int i=0; i<banks; i++) {
				if (reserves[i] < 0) {
					ok = false;
					break;
				}
			}
					
			System.out.println(ok ? "S" : "N");
		}
		
		in.close();
	}

}
