package Maths;
import java.util.*;

class Herons_Formula
{
    int a,b,c;
    double ar,p;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter First Side :");
        a=sc.nextInt();
        
        System.out.println("Enter Second Side :");
        b=sc.nextInt();
        
        System.out.println("Enter Third Side :");
        c=sc.nextInt();
    }
    void calculate()
    {
        double s=(a+b+c)/2;
        ar=s*Math.sqrt((s-a)*(s-b)*(s-c));
        p=a+b+c;
    }
    void display()
    {
        System.out.println("Area is :"+ar);
        System.out.println("Perimeter is :"+p);
    }
    public static void main()
    {
        Herons_Formula ob=new Herons_Formula();
        
        ob.accept();
        ob.calculate();
        ob.display();
    }
}