import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

//11727 - Cost Cutting
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for (int i=0; i<T; i++) {
			int[] nums = new int[3];
			
			nums[0] = in.nextInt();
			nums[1] = in.nextInt();
			nums[2] = in.nextInt();
			
			Arrays.sort(nums);
			System.out.println("Case " + (i+1) + ": " + nums[1]);
		}
		
		in.close();
	}
}
