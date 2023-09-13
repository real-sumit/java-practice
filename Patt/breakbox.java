package Patt;
import java.util.Scanner;

class breakbox
{
    public static void main()
    {
        int n,mid;
        
        Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter size : ");
        n=sc.nextInt();
        
        mid=(n+1)/2;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1 || j==1 || i==n || j==n)
                System.out.print("# ");
                else if(i==2 && j==2)
                System.out.print("# ");
                else if(i==2 && j==n-1)
                System.out.print("# ");
                else if(i==n-1 && j==2)
                System.out.print("# ");
                else if(i==n-1 && j==n-1)
                System.out.print("# ");
                else if(i==mid && j==mid)
                System.out.print("# ");
                else if(n%2==0 && ((i==mid+1 || i==mid) && (j==mid+1 || j==mid)))
                System.out.print("# ");                 
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}