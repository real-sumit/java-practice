package Algos;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
public class multiple_dropcaps {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int h[]=new int[26];
		
		System.out.println("Enter heights of each and every alphabets");
		for(int i=0;i<26;i++)
			h[i]=sc.nextInt();
		
		System.out.print("Enter the word : ");
		String word=sc.next();
		
		int max=0;
		
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			if(ch>max)
				max=ch;
		}
		
		System.out.println("Area taken : "+word.length()*(max-97));
	}
}
