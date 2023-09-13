package Patt;
import java.util.*;

class alter_patt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter size : ");
        int n=sc.nextInt();
        
        int s=0;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(s+" ");
                s=s+2;
            }
            s=(i%2==0?0:1);
            System.out.println();
        }
    }
}
