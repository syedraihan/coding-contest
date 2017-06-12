import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

// 11364 - Parking
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		for (int i=0; i<T; i++) {
			int N = in.nextInt();
            int[] nums = new int[N];
			for (int j=0; j<N; j++) {
				nums[j] = in.nextInt();
			}
            Arrays.sort(nums);
            int l = nums[0];
            int r = nums[nums.length-1];

            System.out.println(2 * (r-l));
		}
		
		in.close();	
	}
}
