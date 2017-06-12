import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		for (int i=1; i<=T; i++)
		{
			double C = in.nextDouble();
			double F = in.nextDouble();
			double X = in.nextDouble();

			double timeSpent = 0.0;
			double rate = 2.0;
			
			while (true)
			{
				double t1 = X / rate;	
				double t2 = X / (rate + F) + C / rate;
				
				if (t2 < t1)
				{
					timeSpent += (C / rate);
					rate += F;
				}
				else
					break;
			}
			
			print("Case #" + i + ": " + (timeSpent + X / rate));
		}
	}
	
	private static void print(String s)
	{
		System.out.println(s);
	}	
}


