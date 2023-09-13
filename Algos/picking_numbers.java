package Algos;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/picking-numbers/problem
public class picking_numbers {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of the array :");
		int n=sc.nextInt();
		
		int pick[]=new int [n];
		
		System.out.println("Enter numbers in the array :");
		for(int i=0;i<n;i++)
			pick[i]=sc.nextInt();
		
		int c1=0,c2=0,c3=0,max=0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(pick[i]==pick[j])
					c1++;
				else if(pick[i]-1==pick[j])
					c2++;
				else if(pick[i]+1==pick[j])
					c3++;
			}
			if(c1+c2>max)
				max=c1+c2;
			if(c1+c3>max)
				max=c1+c3;
			
			c1=0;
			c2=0;
			c3=0;
		}
		
		System.out.println("Longest Subarray : "+max);
	}
}
