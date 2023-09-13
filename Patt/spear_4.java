package Patt;
import java.util.*;

class spear_4
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter size : ");
        int n=sc.nextInt();
       
        for(int i=1,j=n;i<=n || j>=1;i++,j--)
        {
            for(int k=j;k<=n-1;k++)
            System.out.print(k+" ");
            
            for(int l=n;l>=i;l--)
            System.out.print(l+" ");
            
            System.out.println();
        }
    }
}