import java.io.*;

class numbers
{
   public static void method1() throws IOException
   {
       InputStreamReader i=new InputStreamReader(System.in);
       BufferedReader bb=new BufferedReader(i);
       
       int a=Integer.parseInt(bb.readLine());
       if(a>0 && a%2==0)
       System.out.println("POSITIVE EVEN");
          
       else if(a>0 && a%2==1)
       System.out.println("POSITIVE ODD");
             
       else if(a<0 && a%2==0)
       System.out.println("NEGATIVE EVEN");
       
       else if(a<0 && a%2==1)
       System.out.println("NEGATIVE ODD");
       
       else
       System.out.println("ZERO");
    }  
   public static void method2() throws IOException
   {
       InputStreamReader i=new InputStreamReader(System.in);
       BufferedReader bb=new BufferedReader(i);
       
       int n=Integer.parseInt(bb.readLine());
       if(n>0)
       {
          if(n%2==0)
          System.out.println("POSITIVE EVEN");
          else if(n%2==1)
          System.out.println("POSITIVE ODD");
        }
       else if(n<0)
       {
          if(n%2==0)
          System.out.println("NEGATIVE EVEN");
          else if(n%2==1)
          System.out.println("NEGATIVE ODD");
        }
       else
       {
          System.out.println("ZERO");
        }
    }
}