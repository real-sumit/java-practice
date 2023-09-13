package Patt;
import java.util.*;

class alter
{
   public static void main(String args[])
   {
	   int ch,n;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Input ch(1/2) and n");
	   ch=sc.nextInt();
	   n=sc.nextInt();
	   
       if(ch==1)
       for(int i=1;i<=n;i++)
       {
           int k=i%2;
           for(int j=1;j<=i;j++)
           {
               if(k==0)
               System.out.print("#"+" ");
               else
               System.out.print("$"+" ");
           }
           System.out.println("");
       }
        
       else if(ch==2)
       for(int i=1;i<=n;i++)
       {
           for(int j=1;j<=i;j++)
           {
               if(j%2==0)
               System.out.print("1 ");
               else
               System.out.print("0 ");
            }
           System.out.println();
       }
    }
}