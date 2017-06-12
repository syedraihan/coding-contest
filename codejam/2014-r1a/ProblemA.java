import java.util.*;
public class ProblemA {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		for (int i=1; i<=T; i++)
		{
			int N = in.nextInt();
			int L = in.nextInt();
			
			int[] orig = new int[N];
			int[] needed = new int[N];
			
			for (int j=0; j<N; j++) 
			{
				String s = in.next();
				orig[j] = parseBinary(s, L);
			}
			for (int j=0; j<N; j++) 
			{
				String s = in.next();
				needed[j] = parseBinary(s, L);
			}

			int[] diffBits = new int[N];
			for (int j=0; j<N; j++) 
			{
				diffBits[j] = countBits(orig[j] ^ needed[j]);
			}
			
			Boolean possible = true;
			for (int j=1; j<N; j++)
			{
				if (diffBits[j] != diffBits[j-1])
				{
					possible = false;
					break;
				}
			}
			
			if (possible)
				print("Case #" + i + ": " + diffBits[0]);
			else
				print("Case #" + i + ": " + "NOT POSSIBLE");
		}
	}

	private static Integer countBits(int n)
	{
		int countBits = 0;
        while (n != 0)
        {
            if((n&1)>0)
            {
	            countBits++;
            }
            n=n>>>1;
        }
        
        return countBits;
	}
	
	private static int parseBinary(String s, int L)
	{
		int value = 0;
		for (int i=0; i<L; i++)
		{
			int bit = Character.getNumericValue(s.charAt(i));
			value += Math.pow(2, (L - i - 1)) * bit;
		}	
		
		return value;
	}
	
	private static void print(String s)
	{
		System.out.println(s);
	}
}
