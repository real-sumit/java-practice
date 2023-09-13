package Maths;
import java.util.*;

class division
{
    int int_div(int n,int d)
    {
        int q=0;
        
        while(d<=n)
        {
            q++;
            n=n-d;
        }
        
        return q;
    }
    double real_div(double n,double d)
    {
        double q=0,m=1;
        
        while(n>0)
        {
            if(d<=n)
            {
                q=q+m;
                n=n-d;
            }
            else if(d>n)
            {
                m=m/10;
                d=d/10;
            }
        }
        
        return q;
    }
    public static void main()
    {
        division ob=new division();
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter dividend :");
        double n=sc.nextInt();
        
        System.out.println("Enter divisor :");
        double d=sc.nextInt();
            
        System.out.println("Enter ur choice(I for Integer and R for Real) :");
        char ch=sc.next().charAt(0);
        sc.close();
        
        switch(ch)
        {
            case 'I':
            System.out.println("Value : "+ob.int_div((int)n,(int)d));
            break;
            
            case 'R':
            System.out.println("Value : "+ob.real_div(n,d));
            break;
            
            default:
            System.out.println("Don't type fucking shit");
        }
    }
}