package Patt;
import java.util.*;

class squarepatt
{
   public static void main(String[] args)
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter n");
	   int n=sc.nextInt();
	   
       int s=0,p=0;       
       for(int i=1;i<=n;i++)
       {
           for(int  j=1;j<=i;j++)
           {
               p=j*j;
               System.out.print(p+" ");
           }
           for(int f=n;f>=i;f--)
           System.out.print("   ");
           
           s=s+p;
           System.out.print(s);
             
           System.out.println();
       }
   }
}