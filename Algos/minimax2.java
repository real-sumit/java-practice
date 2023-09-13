package Algos;
import java.util.*;
//https://www.hackerrank.com/challenges/mini-max-sum/problem
class minimax2
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
        int max_sum=0,min_sum=0;
        
        for(int i=1;i<no;i++)
        {
            if(max<n[i])
            {
                min_sum=min_sum+max;
                max=n[i];
            }
            else
            min_sum=min_sum+n[i];
            
            if(min>n[i])
            {
                max_sum=max_sum+min;
                min=n[i];
            }
            else
            max_sum=max_sum+n[i];
        }
        
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
        System.out.println("Max_sum = "+max_sum);
        System.out.println("Min_sum = "+min_sum);
        System.out.println("Difference = "+(max_sum-min_sum));
    }
}