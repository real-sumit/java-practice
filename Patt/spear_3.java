package Patt;
import java.util.*;

class spear_3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter size : ");
        int n=sc.nextInt();
       
        for(int i=n,j=1;i>=1 || j<=n;i--,j++)
        {
            for(int k=i;k>=1;k--)
            System.out.print(k+" ");
            
            for(int l=2;l<=j;l++)
            System.out.print(l+" ");
                        
            System.out.println();
        }
    }
}