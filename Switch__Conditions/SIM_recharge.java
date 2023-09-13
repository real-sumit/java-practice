package Switch__Conditions;
import java.util.*;

class SIM_recharge
{
    double cost=0.0;
    public static void main ()
    {
        SIM_recharge ob=new SIM_recharge();
        
        System.out.println("TOTAL COST : Rs "+ob.calculate());
    }
    public double calculate()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("ENTER NUMBER OF UNITS : ");
        int unit=sc.nextInt();
        
        if(unit<=30)
        cost=unit*.90;
        
        else if(unit>=31 && unit<=60)
        cost=(30*.90)+(unit-30)*.80;
        
        else if(unit>=61 && unit<=100)
        cost=(30*.90)+(30*.80)+(unit-60)*.70;
        
        else if(unit>=101 && unit<=150)
        cost=(30*.90)+(30*.80)+(40*.70)+(unit-100)*.60;
        
        else
        cost=(30*.90)+(30*.80)+(40*.70)+(50*.60)+(unit-150)*.50;
        
        return cost;
    }
}