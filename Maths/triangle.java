package Maths;
import java.util.*;

class triangle
{
    int a,b,c;
    void accept(String t)
    {
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Enter 1st "+t+":");
         a=sc.nextInt();
         
         System.out.println("Enter 2nd "+t+":");
         b=sc.nextInt();
         
         System.out.println("Enter 3rd "+t+":");
         c=sc.nextInt();
    }
    void angle()
    {
         if((a+b+c)==180)
         {
             if(a==b && b==c && c==a)
             System.out.println("EQUILATERAL TRIANGLE");
             else if(a!=b && b!=c && a!=c)
             {
                System.out.println("SCALENE TRIANGLE");
                if(a<90 && b<90 && c<90)
                System.out.println("ACUTE ANGLED TRIANGLE");
                else if(a==90 || b==90 || c==90)
                System.out.println("RIGHT ANGLED TRIANGLE");
                else if(a>90 || b>90 || c>90)
                System.out.println("OBTUSE ANGLED TRIANGLE");
             }
             else
             {
                System.out.println("ISOSCELES TRIANGLE");
                if(a<90 && b<90 && c<90)
                System.out.println("ACUTE ANGLED TRIANGLE");
                else if(a==90 || b==90 || c==90)
                System.out.println("RIGHT ANGLED TRIANGLE");
                else if(a>90 || b>90 || c>90)
                System.out.println("OBTUSE ANGLED TRIANGLE");
             }
         }
         else
         System.out.println("TRIANGLE NOT FORMED");
    }
    void side()
    {
         if((a+b)>c && (b+c)>a && (c+a)>b)
         {
             if(a==b && b==c && c==a)
             System.out.println("EQUILATERAL TRIANGLE");
                      
             else if(a!=b && b!=c && a!=c)
             System.out.println("SCALENE TRIANGLE");
                          
             else
             System.out.println("ISOSCELES TRIANGLE");
         }
         else
         System.out.println("TRIANGLE NOT FORMED");
    }
    public static void main()
    {
        triangle ob=new triangle();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        
        String t="";
        if(ch==1)
        t="angle";
        else if(ch==2)
        t="side";
        
        ob.accept(t);
        switch(ch)
        {
            case 1:
            ob.angle();
            break;
            
            case 2:
            ob.side();
            break;
        }
    }
}