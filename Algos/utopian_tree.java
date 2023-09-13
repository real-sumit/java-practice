package Algos;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/utopian-tree/problem
public class utopian_tree {
	int the_tree(int n) {
		if(n==0)
			return 1;
		else if(n%2==0)
			return the_tree(n-1)+1;
		else
			return 2*the_tree(n-1);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		utopian_tree ob=new utopian_tree();
		
		System.out.print("Enter no. of cycles : ");
		int n=sc.nextInt();
		
		System.out.println("Periods"+"\t\t"+"Height");
		for(int i=0;i<=n;i++)
			System.out.println(i+"\t\t"+ob.the_tree(i));
	}

}
