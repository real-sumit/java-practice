package Switch__Conditions;
import java.util.*;

class Electric_Bill
{
    public static void main()
    {
        Electric_Bill ob=new Electric_Bill();
        
        Scanner sc=new Scanner(System.in);
        
        int prev,pres,unit;
        double amt=0.0D;
        
        System.out.println("Enter previous reading");
        prev=sc.nextInt();
        
        System.out.println("Enter present reading");
        pres=sc.nextInt();
        
        unit=pres-prev;
        amt=ob.calculate(unit);
        
        System.out.println("Unit Consumed : "+unit);
        System.out.println("Total Amount : Rs "+amt);
    }
    double calculate(int u)
    {
        double cost=0.0D;
        
        if(u<=100)
        cost=u*1.25;
        
        else if(u>=101 && u<=200)
        cost=(100*1.25)+(u-100)*1.50;
        
        else if(u>=201 && u<=400)
        cost=(100*1.25)+(100*1.50)+(u-200)*1.75;
        
        else
        cost=(100*1.25)+(100*1.50)+(200*1.75)+(u-400)*2.00;
        
        return cost;
    }
}