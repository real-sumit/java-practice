package Algos;
import java.util.*;

public class permuting_an_eqn {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number = ");
		int n=sc.nextInt();
		
		int p[]=new int[n];
		int y[]=new int[n];
		int c=0;
		
		System.out.println("Enter numbers in array ");
		for(int i=0;i<n;i++)
			p[i]=sc.nextInt();
		
		for(int x=1;x<=n;x++) {
			for(int j=0;j<n;j++) {
				if(p[p[j]-1]==x)
					y[c++]=j+1;
			}
		}
		
		System.out.println("The numbers are : ");
		for(int i=0;i<n;i++)
			System.out.print(y[i]+" ");
	}
}
