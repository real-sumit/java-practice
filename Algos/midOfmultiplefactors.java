package Algos;
import java.util.*;

class midOfmultiplefactors
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter factor of numbers :");
        int n1=sc.nextInt();
        
        System.out.println("Enter multiple of numbers :");
        int n2=sc.nextInt();
        
        
        int mid[]=new int[n2/n1];
        int i=0;
        
        while(i*n1<n2)
        {
            mid[i]=(i+1)*n1;
            i++;
        }
        
        for(i=0;i<n2/n1;i++)
        	if(n2%mid[i]!=0)
        		mid[i]=0;
        
        System.out.println("The numbers are : ");
        for(i=0;i<n2/n1;i++)
        	if(mid[i]!=0)
        		System.out.println(mid[i]);
    }
}
        