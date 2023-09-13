
import java.util.*;

public class sorting_matrix {
	int n;
	int m[][], rm[][];
	
	void input() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter size of matrix : ");
		n=sc.nextInt();
		
		m=new int[n][n];
		
		System.out.println("Enter elements in matrix : ");
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++) {
				System.out.print("Column "+i+" Row "+j+" : ");
				m[i][j]=sc.nextInt();
			}
	}
	void rearrange() {
		int x[]=new int[n*n-4*n+4];
		int k=0,key;
		
		for(int i=1;i<n-1;i++)	//initializing non-boundary elements in x
			for(int j=1;j<n-1;j++) {
				x[k]=m[i][j];
				k++;
			}
		
		k=0;	//initializing k to 0
		
		for(int i=1;i<x.length;i++) {	//sorting array x
			key=x[i];
			k=i-1;
			while(k>=0 && x[k]>key) {
				x[k+1]=x[k];
				k--;
			}
			x[k+1]=key;
		}
		
		k=0;
		rm=new int[n][n];
		
		for(int i=0;i<n;i++)		//initializing matrix rm
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==n-1 || j==n-1)
				rm[i][j]=m[i][j];
				else {
					rm[i][j]=x[k];
					k++;
				}
			}
	}
	
	void output() {
		System.out.println("Original Matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(m[i][j]+"\t");
			System.out.println();
		}
		
		System.out.println("Rearranged Matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(rm[i][j]+"\t");
			System.out.println();
		}
		
		int sum=0;
		System.out.println("Diagonal Elements");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				if(i==j || i+j==n-1) {
					System.out.print(rm[i][j]+"\t");
					sum=+rm[i][j];
				}
				else
					System.out.print("\t");
			System.out.println();
		}
		
		System.out.println("Sum of diagonals : "+sum);
	}
	
	public static void main(String[] args) {
		sorting_matrix ob=new sorting_matrix();
		
		ob.input();
		ob.rearrange();
		ob.output();
		
	}
}
