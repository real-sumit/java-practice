package Algos;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/circular-array-rotation/problem
public class array_rotation {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter size of the array : ");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter nos. in the array : ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		System.out.print("Enter no. of rotations we should perform : ");
		int r=sc.nextInt();
		
		int x[]=new int[r];
		
		for(int i=0;i<r;i++)
			x[i]=a[n-r+i];
		
		for(int i=n-1;i>=r;i--)
			a[i]=a[i-r];
		
		for(int i=0;i<r;i++)
			a[i]=x[i];
		
		System.out.print("Array after rotation : ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}
