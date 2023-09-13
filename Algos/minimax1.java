package Algos;
import java.util.*;
//https://www.hackerrank.com/challenges/mini-max-sum/problem
class minimax1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter length of array");
        int no=sc.nextInt();
        
        int n[]=new int[no];
        
        System.out.println("Enter numbers : ");
        for(int i=0;i<no;i++)
        n[i]=sc.nextInt();
        
        int max=n[0],min=n[0];
        int sum=n[0];
        
        for(int i=1;i<no;i++)
        {
            if(max<n[i])
            max=n[i];
            
            if(min>n[i])
            min=n[i];
            
            sum=sum+n[i];
        }
        
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
        System.out.println("Max_sum = "+(sum-min));
        System.out.println("Min_sum = "+(sum-max));
        System.out.println("Difference = "+(max-min));
    }
}