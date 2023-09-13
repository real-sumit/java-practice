package Patt;
import java.util.Scanner;

class rubiks_square
{ 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter size : ");
        int n=sc.nextInt();
        
        int s=2*n+1;
        
        for(int i=1;i<=s;i++)
        {
            for(int j=1;j<=s;j++)
            {
                if(i%2==1 && j%2==1)
                System.out.print(". ");
                else if(i%2==1)
                System.out.print("- ");
                else if(j%2==1)
                System.out.print("| ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}