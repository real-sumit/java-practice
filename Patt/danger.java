package Patt;
import java.util.*;
class danger
{
    public static void main(String args[])  
    {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
        for(int i=2;i<=n;i=i+2)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%4==0)
                System.out.print("$ ");
                else
                System.out.print("# ");          
            }
            System.out.println();
        }
        
        for(int i=n-2;i>=2;i=i-2)
        {
            for(int j=1;j<=i;j++)        
            {
                if(i%4==0)
                System.out.print("$ ");
                else
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}