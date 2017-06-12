import java.util.Scanner;
import java.util.Arrays;

public class ProblemD {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		for (int i=1; i<=T; i++)
		{
			int c = in.nextInt();
			double[] w1 = new double[c];
			double[] w2 = new double[c];			
			for (int j=0; j<c; j++) w1[j] = in.nextDouble();				
			for (int j=0; j<c; j++) w2[j] = in.nextDouble();
			
			Arrays.sort(w1);
			Arrays.sort(w2);
			
			//double[] dw2 = w2.clone();
			
			int score = 0;
			int scoreD = 0;
			for(int j=0; j<c; j++)
			{
				// Play Fair
				int index = findKensMove(w2, w1[j]);
				if (w1[j] > w2[index]) 
					score++;

				// Play Unfair
				for (int k=0; k<w2.length; k++)
				{
					if (w1[j] > w2[k])
					{
						scoreD++;
						break;
					}
				}
				
				w1[j] = 0.0;
				w2[index] = 0.0;				
			}
			
			print("Case #" + i +  ": " + scoreD + " " + score);
		}
	}
	
	private static int findKensMove(double[] arr, double val)
	{
		// find the element that is greater than val
		for(int i=0; i<arr.length; i++)
			if (arr[i] > val) return i;
		
		// if no such item, then return first non-zero item
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i] > 0)
			{
				return i;	
			}
		}
		
		return -1;
	}
	
	private static void print(String s)
	{
		System.out.println(s);
	}	
}
