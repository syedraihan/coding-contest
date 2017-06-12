import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//573 - The Snail
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);

		while (true) {
			double wall = in.nextDouble();
			double up = in.nextDouble();
			double down = in.nextDouble();
			double fatigue = up * in.nextDouble() / 100.0;			
			if (wall == 0) break;

			int day = 0;
			double height = 0.0;
			while (true) {
				day++;				
				if (up > 0.0) height += up;
				up -= fatigue;
				if (height > wall)  break;
				height -= down;
				if (height < 0.0) break;
			}
			
			System.out.println((height > 0 ? "success" : "failure") + " on day " + day);
		}
		in.close();
	}

}
