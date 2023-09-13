package Patt;
import java.util.Scanner;

class checkboard
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter size : ");
        int n=sc.nextInt();
        
        char x,z;
        System.out.println("Enter two symbols for checkboard : ");
        x=sc.next().charAt(0);
        z=sc.next().charAt(0);
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if((i+j)%2==0)
                System.out.print(x+" ");                    
                else
                System.out.print(z+" ");                
            }
            System.out.println();
        }
    }
}