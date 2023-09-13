package Patt;
import java.util.Scanner;

class box
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
                if(i==0)
                System.out.print(str.charAt(j)+" ");               
                else if(j==0)
                System.out.print(str.charAt(i)+" ");
                else if(i==l-1)
                System.out.print(str.charAt(l-1-j)+" ");
                else if(j==l-1)
                System.out.print(str.charAt(l-1-i)+" ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}