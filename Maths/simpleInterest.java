package Maths;
import java.util.*;

class simpleInterest
{
    double p,r,t;
    double i,amt;
    void input()
    {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter Principal :");
        p=sc.nextDouble();
        
        System.out.println("Enter Rate :");
        r=sc.nextDouble();
        
        System.out.println("Enter Time :");
        t=sc.nextDouble();
    }
    void simple()
    {
        i=(p*r*t)/100;
        amt=p+i;
    }
    void compound()
    {
        amt=p*Math.pow(1+(r/100),t);
        i=amt-p;
    }
    void print()
    {
        System.out.println("Interest = "+i);
        System.out.println("Amount = "+amt);
    }
    public static void main()
    {
    	simpleInterest ob=new simpleInterest();
        
        ob.input();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice :");
        int ch=sc.nextInt();
        
        switch(ch)
        {
           case 1:
           ob.simple();
           break;
        
           case 2:
           ob.compound();
           break;
        
           default:
           System.out.println("Interest is not calculated in any other method ");
        }
        
        ob.print();
    }
}