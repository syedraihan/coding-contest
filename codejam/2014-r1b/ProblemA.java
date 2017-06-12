import java.util.Scanner;

public class ProblemA 
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		for (int c=1; c<=T; c++)
		{
			int N = in.nextInt();
			String[] strings = new String[N];
			String[] compressed = new String[N];
			
			int[][]charCounts = new int[N][26];
			
			for (int i=0; i<N; i++)
			{
				strings[i] = in.next();
				compressed[i] = compress(strings[i]);
				
				for (int j=0; j<strings[i].length(); j++)
				{
					charCounts[i][strings[i].charAt(j) - 'a']++;
				}
			}
			
			if (!allEqual(compressed))
				print("Case #" + c + ": Fegla Won");
			else
			{
				int count = 0;
				for (int i=0; i<26; i++)
				{
					count += Math.abs(charCounts[0][i] - charCounts[1][i]);
				}
				print("Case #" + c + ": " + count);
			}
				
		}
	}

	private static String compress(String s)
	{
		char[] result = new char[s.length()];
		int index = 0;
		
		result[index] = s.charAt(0);
		for (int i=1; i<s.length(); i++)
		{
			char c = s.charAt(i); 
			if (result[index] != c)
			{
				result[++index] = c;
			}
		}
		
		return new String(result).trim();
	}
	
	private static Boolean allEqual(String[] strings)
	{
		Boolean result = true;
		String s = strings[0];
		for (int i=1; i<strings.length; i++)
		{
			if (!s.equals(strings[i]))
			{
				result = false;
				break;
			}
		}
		
		return result;
	}
	
	private static void print(String s)
	{
		System.out.println(s);
	}
}
