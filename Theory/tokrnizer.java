package Theory;
import java.util.*;
public class tokrnizer {
	public static void main(String args[]) {
		String x="welcome to ranaghat nadia";
		StringTokenizer test=new StringTokenizer(x," ");
		
		while(test.hasMoreTokens()) {
			System.out.println(test.nextToken());
		}
	}
}
