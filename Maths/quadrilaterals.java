package Maths;
import java.util.*;

class quadrilaterals
{
    double ar,p;
    Scanner sc=new Scanner(System.in);
    void square()
    {
        System.out.println("-:Square:-");
           
        System.out.println("Enter Side :");
        double a=sc.nextDouble();
        
        ar=a*a;
        p=4*a;
    }
    void rectangle()
    {
        System.out.println("-:Rectangle:-");
           
        System.out.println("Enter Length :");
        double l=sc.nextDouble();
        
        System.out.println("Enter Breadth :");
        double b=sc.nextDouble();
        
        ar=l*b;
        p=2*(l+b);
    }
    void rhombus()
    {
        System.out.println("-:Rhombus:-");
           
        System.out.println("Enter Smaller Diagonal :");
        double sd=sc.nextDouble();
           
        System.out.println("Enter Larger diagonal :");
        double ld=sc.nextDouble();
        
        System.out.println("Enter Side :");
        double sr=sc.nextDouble();
        
        ar=0.5*sd*ld;
        p=4*sr;
    }
    void parallogram()
    {
        System.out.println("-:Parallelogram:-");
           
        System.out.println("Enter Vertical Tilted Side :");
        double sp=sc.nextDouble();
           
        System.out.println("Enter Base :");
        double bp=sc.nextDouble();
           
        System.out.println("Enter Height :");
        double hp=sc.nextDouble();
        
        ar=bp*hp;
        p=2*(sp+hp);
    }
    void trapezium()
    {
        System.out.println("-:Trapezium:-");
           
        System.out.println("Enter Smaller Parallel Side :");
        double sp=sc.nextDouble();
           
        System.out.println("Enter Larger Parallel Side :");
        double lp=sc.nextDouble();
           
        System.out.println("Enter both Tilted Sides :");
        double ts1=sc.nextDouble();
        double ts2=sc.nextDouble();
                      
        System.out.println("Enter Height :");
        double ht=sc.nextDouble();
        
        ar=0.5*ht*(sp+lp);
        p=sp+lp+ts1+ts2;
    }
    void kite()
    {
        System.out.println("-:Kite|Diamond:-");
           
        System.out.println("Enter Diagonal between two same angles :");
        double de=sc.nextDouble();
           
        System.out.println("Enter Diagonal which bisects two angles:");
        double dn=sc.nextDouble();
           
        System.out.println("Enter Smaller Side :");
        double ss=sc.nextDouble();
                      
        System.out.println("Enter Larger Side :");
        double ls=sc.nextDouble();
        
        ar=0.5*de*dn;
        p=2*(ss+ls);
    }
    void display()
    {
        System.out.println("Area is :"+ar+" sq units");
        System.out.println("Perimeter is :"+p+" units");
    }
    public static void main()
    {
        quadrilaterals ob=new quadrilaterals();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice :");
        int ch=sc.nextInt();
        
        switch(ch)
        {
           case 1:
           ob.square();
           break;
           
           case 2:
           ob.rectangle();
           break;
           
           case 3:
           ob.rhombus();
           break;
           
           case 4:
           ob.parallogram();
           break;
           
           case 5:
           ob.trapezium();
           break;
           
           case 6:
           ob.kite();
           break;
           
           default:
           System.out.println("No Other Quadrilaterals :");
        }
        
        ob.display();
    }
}