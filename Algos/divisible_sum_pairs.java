package Algos;
import java.util.*;
//https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
class divisible_sum_pairs
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter length of the array: ");
        int n=sc.nextInt();
        
        int ar[]=new int[n];
        
        System.out.println("Enter elements in the array: ");
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        
        System.out.println("Enter a number: ");
        int k=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(ar[i]<ar[j] && (ar[i]+ar[j])%k==0)
                System.out.println("("+ar[i]+","+ar[j]+")");
            }
        }
    }
}
