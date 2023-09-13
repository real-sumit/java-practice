package Maths;
import java.util.*;

class curved_figures
{
    double ar,c;
    Scanner sc=new Scanner(System.in);
    void circle()
    {
        System.out.println("Enter Radius :");
        int r=sc.nextInt();;
        
        ar=Math.PI*r*r;
        c=2*Math.PI*r;
    }
    void ellipse()
    {
        System.out.println("Enter smaller & longer radius :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        ar=Math.PI*a*b;
        c=Math.PI*(a+b);
    }
    void sector()
    {
        System.out.println("Enter radius :");
        int r=sc.nextInt();
        
        System.out.println("Enter angle :");
        int t=sc.nextInt();
        
        ar=(t/360)*Math.PI*r*r;
        c=(2*r)*(1+(t/360)*Math.PI);
    }
    void display()
    {
        System.out.println("Area is : "+ar);
        System.out.println("Circumferance is : "+c);
    }
    public static void main()
    {
        curved_figures ob=new curved_figures();
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Enter your choice :");
        int ch=sc1.nextInt();
        sc1.close();

        switch(ch)
        {
            case 1:
            ob.circle();
            break;
            
            case 2:
            ob.ellipse();
            break;
            
            case 3:
            ob.sector();
            break;
            
            default:
            System.out.println("No other circular figures present");
        }
        ob.display();
    }
}