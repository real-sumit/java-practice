package Maths;
import java.util.*;

class half_base_ht
{
    double h,ar,p;
    Scanner sc=new Scanner(System.in);
    void right_angled()
    {
        System.out.println("-:Right Angled Triangle:-");
        
        System.out.println("Enter Base :");
        double b=sc.nextDouble();
        
        System.out.println("Enter Height :");
        double ht=sc.nextDouble();
        
        h=Math.sqrt(Math.pow(b,2)+Math.pow(ht,2));
        ar=0.5*b*ht;
        p=b+ht+h;
    }
    void equilateral()
    {
        System.out.println("-:Equilateral Triangle:-");
        
        System.out.println("Enter Side :");
        double a=sc.nextDouble();
        
        h=(Math.sqrt(3)*a)/2;
        ar=0.5*a*h;
        p=3*a;
    }
    void isosceles()
    {
        System.out.println("-:Isosceles Triangle:-");
        
        System.out.println("Enter Unequal Side :");
        double a=sc.nextDouble();
        
        System.out.println("Enter Equal Side :");
        double b=sc.nextDouble();
        
        h=0.5*Math.sqrt(4*b*b-a*a);
        ar=0.5*a*h;
        p=(2*b)+a;
    }
    void display()
    {
        System.out.println("Area = "+ar);
        System.out.println("Perimeter = "+p);
    }
    public static void main()
    {
        half_base_ht ob=new half_base_ht();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice :");
        int ch=sc.nextInt();
        
        switch(ch)
        {
            case 1:
            ob.right_angled();
            break;
            
            case 2:
            ob.equilateral();
            break;
            
            case 3:
            ob.isosceles();
            break;
            
            default:
            System.out.println("NO MORE TYPES OF TRIANGLES");
        }
        
        ob.display();
    }
}