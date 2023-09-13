package Patt;
import java.util.Scanner;

class pacman
{
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
 	   System.out.println("Input n");
 	   int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            System.out.print("* ");
            
            System.out.println();
        }
        for(int i=2;i<=n;i++)
        {
            for(int j=2;j<=i;j++)
            System.out.print("* ");
           
            System.out.println();
        }
    }
}