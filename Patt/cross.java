package Patt;
import java.util.Scanner;

class cross
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
                if(i==j)
                System.out.print(str.charAt(i)+" ");               
                else if((i+j)==(l-1))
                System.out.print(str.charAt(i)+" ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}