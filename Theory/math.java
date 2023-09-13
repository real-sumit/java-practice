package Theory;
import java.math.*;

class math
{
    public static void algebra(double x)
    {
        System.out.println("x\t"+x);
        System.out.println();
        
        System.out.println(Math.pow(x,x));
        System.out.println(Math.sqrt(x));
        System.out.println(Math.abs(x));
        System.out.println(Math.floor(x));
        System.out.println(Math.ceil(x));
        System.out.println(Math.rint(x));
        System.out.println(Math.round(x));
        System.out.println(Math.log(x));
        System.out.println(Math.exp(x));
        System.out.println(Math.PI);        
    }
    public static void trigonometrical_functions(int a)
    {
        double A=(a*Math.PI)/180.0;
        System.out.println(Math.sin(A));
        System.out.println(Math.cos(A));
        System.out.println(Math.tan(A));
        System.out.println(Math.atan(A));
        System.out.println(Math.acos(A));
        System.out.println(Math.asin(A));
    }
    public static void random(int l)
    {
        for(int i=1;i<=l;i++)
        System.out.println(Math.random());
    }
    public static void max_min(int a,int b)
    {
        System.out.println("a\t"+a);
        System.out.println("b\t"+b);
        System.out.println();
        
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
    }
}