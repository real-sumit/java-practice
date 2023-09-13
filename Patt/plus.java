package Patt;
import java.util.Scanner;

class plus
{ 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        
        int l=str.length();
        
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(j==((l+1)/2)-1 && l%2==1)
                System.out.print(str.charAt(i)+" ");
                else if(j==(l/2)-1 || j==l/2 && l%2==0)
                System.out.print(str.charAt(i)+" ");
                else if(i==((l+1)/2)-1 && l%2==1)
                System.out.print(str.charAt(j)+" ");
                else if(i==(l/2)-1 || i==l/2 && l%2==0)
                System.out.print(str.charAt(j)+" ");                
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}