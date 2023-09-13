import java.util.Scanner;

class toss
{
    public static void main()
    {
        int n,h=0,t=0;
        double a,b;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter number of times the toss will done : ");
        n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            a=Math.random();
            b=Math.rint(a);
            if(b==1) h++;
            else t++;
        }
        System.out.println("Number of times head obtained :"+h);
        System.out.println("Number of times tail obtained :"+t);
    }
}