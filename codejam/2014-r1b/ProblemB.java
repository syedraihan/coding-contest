import java.util.*;

public class ProblemB 
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		long T = in.nextLong();
		for (int c=1; c<=T; c++)
		{
			long A = in.nextLong();
			long B = in.nextLong();
			long K = in.nextLong();
			
			long count=0;
			for (long a=0; a<A; a++)
			for (long b=0; b<B; b++)
			{
				if ((a & b) < K) count++; 
			}
			
			print("Case #" + c + ": " + count);
		}
	}

	private static void print(String s)
	{
		System.out.println(s);
	}
}
