package Switch__Conditions;
import java.util.*;

class Commission
{
    double sales,comm=0;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Sales :");
        sales=sc.nextDouble();
    }
    void compute()
    {
        if(sales>=100000)
        comm=sales*(0.25);
        
        else if(sales>=80000)
        comm=sales*(0.225);
        
        else if(sales>=60000)
        comm=sales*(0.20);
        
        else if(sales>=40000)
        comm=sales*(0.175);
        
        else if(sales>=20000)
        comm=sales*(0.15);
         
        else
        comm=sales*(0.125);
    }
    void print()
    {
        System.out.println("Commission is :"+comm);
    }
    public static void main()
    {
        Commission ob=new Commission();
        
        ob.input();
        ob.compute();
        ob.print();
    }
}