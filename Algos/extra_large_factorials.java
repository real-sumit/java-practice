package Algos;
//https://www.hackerrank.com/challenges/extra-long-factorials/problem
import java.util.*;
import java.math.*;

public class extra_large_factorials {
	
	static BigInteger factorial(int n){
		BigInteger product=BigInteger.ONE;
	        for(int i=2; i<=n; i++)
	        	product= product.multiply(BigInteger.valueOf(i));
	        
	        return product;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(factorial(sc.nextInt()));
	}
}
