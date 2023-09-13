package Switch__Conditions;
import java.util.*;

class Income_Tax
{
    char g;
    int a;
    double s,tax=0;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter gender in M or F :");
        g=sc.next().charAt(0);
        
        System.out.println("Enter age :");
        a=sc.nextInt();
        
        System.out.println("Enter taxable income :");
        s=sc.nextDouble();
    }
    void compute()
    {
        if(a<=65 && g=='M')
        {
            if (s<=160000)
            tax=0.0;
            
            if (s>160000 && s<=500000)
            tax=(s-160000)*.10;
            
            if(s>500000 && s<=800000)
            tax=(s-500000)*.20+34000.0;
            
            if(s>800000)
            tax=(s-800000)*.30+94000.0;
        }
    }
    void print()
    {
        System.out.println("Income Tax : "+tax);
        System.out.println("Net Salary : "+(s-tax));
    }
    public static void main()
    {
        Income_Tax ob=new Income_Tax();
        
        ob.input();
        ob.compute();
        ob.print();
    }
}