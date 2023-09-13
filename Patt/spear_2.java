package Patt;
import java.util.*;

class spear_2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter size : ");
        int n=sc.nextInt();
       
        for(int i=1,j=n;i<=n || j>=1;i++,j--)
        {
            for(int k=i;k>=1;k--)
            System.out.print(k+" ");
            
            for(int l=2;l<=j;l++)
            System.out.print(l+" ");
                        
            System.out.println();
        }
    }
}