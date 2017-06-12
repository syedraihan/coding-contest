/*
ID: me45
LANG: JAVA
TASK: test
*/
import java.io.*;
import java.util.*;

class test {
  public static void main (String [] args) throws IOException {
		Scanner in = new Scanner(new File("test.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));

		int i1 = in.nextInt();
		int i2 = in.nextInt();
				
		out.println(i1+i2);  
		
		in.close();
		out.close();
		System.exit(0);
  }
}