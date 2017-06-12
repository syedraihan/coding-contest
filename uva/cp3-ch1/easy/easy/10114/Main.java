import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//10114 - Loansome Car Buyer
public class UVa10114 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		
		while (true) {
			int loanDuration = in.nextInt();
			double downPayment = in.nextDouble();
			double loan = in.nextDouble();
			int T = in.nextInt();
			
			double monthlyPayment = loan / loanDuration;
			if (loanDuration < 0)
				break;
				
			double[] depcreciations = new double[loanDuration + 1];
			for (int i=0; i<T; i++) {
				int monthNo = in.nextInt();
				depcreciations[monthNo] = in.nextDouble();
			}
			
			double depcreciation = 0.0;
			double carValue = downPayment + loan;
			double debt = loan;
			
			for(int month=0; month <= loanDuration; month++) {
				if (depcreciations[month] != 0.0)
					depcreciation = depcreciations[month];
				
				carValue *= (1.0 - depcreciation);
				if (month > 0) 
					debt -= monthlyPayment;
				
				if (debt < carValue) {
					System.out.println(month + " month" + (month != 1 ? "s" : ""));
					break;
				}
			}			
		}
		
		in.close();
	}

}
