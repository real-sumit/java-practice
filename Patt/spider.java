package Patt;
import java.util.Scanner;

class spider
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter size : ");
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {                
                if(i+j==n+1)
                System.out.print("# ");
                else if(j==i)
                System.out.print("# ");
                else if(n%2==0 && i==n/2 || i==(n/2)+1)
                System.out.print("# ");
                else if(n%2==0 && j==n/2 || j==(n/2)+1)
                System.out.print("# ");
                else if(n%2==1 && i==(n+1)/2 || j==(n+1)/2)
                System.out.print("# ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}