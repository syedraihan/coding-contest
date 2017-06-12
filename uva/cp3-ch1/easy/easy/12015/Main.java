import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//12015 - Google is Feeling Lucky
public class Main {

	static class Site {
		public String url;
		public int rank;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);

		int tc = in.nextInt();
		for (int c=1; c<=tc; c++) {
			Site[] sites = new Site[10];
			
			int max = 0;
			for (int i=0; i<sites.length; i++) {
				Site site = new Site();
				site.url = in.next();
				site.rank = in.nextInt();	
				
				sites[i] = site;
				max = sites[i].rank > max ? sites[i].rank : max;
			}

			System.out.println("Case #" + c + ":");
			for (int i=0; i<sites.length; i++) {
				if (sites[i].rank == max)
					System.out.println(sites[i].url);
			}
		}
		
		in.close();
	}


}
