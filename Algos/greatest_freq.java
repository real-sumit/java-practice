package Algos;
import java.util.Scanner;

public class greatest_freq {
	public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter size of the array : ");
        int n=sc.nextInt();
        
        int x[]=new int[n];
        System.out.println("Enter numbers in the array : ");
        for(int i=1;i<n;i++)
        	x[i]=sc.nextInt();
        
        int max=0,freq=1;
        
        for(int i=1;i<n;i++) {
        	if(x[i]>max) {
        		max=x[i];
        		freq=1;
        	}
        	else if(x[i]==max) {
        		freq++;
        	}
        }
        
        System.out.println("Max : "+max);
        System.out.println("Freq : "+freq);
    }
}
