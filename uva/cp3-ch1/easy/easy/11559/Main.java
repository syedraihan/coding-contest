import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//11559 - Event Planning
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {
			int participants = in.nextInt();
			int budget = in.nextInt();
			int hotels = in.nextInt();
			int weeks = in.nextInt();
			
			int cost = 2000000000;
			while (hotels-- > 0) {
				int costPerPerson = in.nextInt();
				int w = weeks;
				while (w-- > 0) {
					if (participants <= in.nextInt()) {
						if (cost > participants * costPerPerson) 
							cost = participants * costPerPerson;
					}					
				}
			}
			
			System.out.println(cost <= budget ? cost : "stay home");
		}
		
		in.close();
	}

}
