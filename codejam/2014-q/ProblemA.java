import java.util.*;

public class ProblemA {

	static int n = 0;
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		int[][] mat1 = new int[4][4];
		int[][] mat2 = new int[4][4];
		
		for (int i=1; i<=T; i++)
		{
			n = 0;
			
			int a = in.nextInt();
			readMat(mat1, in);
			
			int b = in.nextInt();
			readMat(mat2, in);
			
			int count = countCommon(mat1[a-1], mat2[b-1]);
			
			if (count == 0)
				print("Case #" + i + ": Volunteer cheated!");
			else if (count == 1)
				print("Case #" + i + ": " + n);
			else 
				print("Case #" + i + ": Bad magician!");
		}
	}

	private static void readMat(int[][] mat, Scanner in)
	{
		for (int row = 0; row < 4; row++)
		for (int col = 0; col < 4; col++)
			mat[row][col] = in.nextInt();
	}
	
	private static int countCommon(int[] row1, int[] row2)
	{
		int count = 0;
		
		for (int i=0; i<4; i++)
		for (int j=0; j<4; j++)
		if (row1[i] == row2[j]) 
		{
			n = row1[i];
			count++;
		}
		
		return count;
	}
	
	private static void print(String s)
	{
		System.out.println(s);
	}
}
