
import java.io.*;

class max_mid_min
{
    public static void main(String [] args)throws IOException
    {
        InputStreamReader A=new InputStreamReader(System.in);
        BufferedReader n=new BufferedReader(A);
        
        max_mid_min ob=new max_mid_min();
        
        System.out.println("ENTER  1st no.");
        double n1=Double.parseDouble(n.readLine());
      
        System.out.println("ENTER  2nd no.");
        double n2=Double.parseDouble(n.readLine());
      
        System.out.println("ENTER  3rd no.");
        double n3=Double.parseDouble(n.readLine());
        
        System.out.println("[A for max][B for mid][C for min]");
        char ch=(char)System.in.read();
        
        switch(ch)
        {
            case 'A':
            System.out.println("Max : "+ob.maximum(n1,n2,n3));
            break;
            
            case 'B':
            System.out.println("Mid : "+ob.midimum(n1,n2,n3));
            break;
            
            case 'C':
            System.out.println("Min : "+ob.minimum(n1,n2,n3));
            break;
        }
    }
    double maximum(double n1,double n2,double n3)
    {
        double max;
      
        if(n1>n2 && n1>n3)
        max=n1;
        else if(n2>n1 && n2>n3)
        max=n2;
        else
        max=n3;
        
        return max;
    }
    double midimum(double n1,double n2,double n3)
    {
        double mid;
        
        if(n2<n1 && n1<n3)
        mid=n1;
        else if(n1<n2 && n2<n3)
        mid=n2;
        else
        mid=n3;
        
        return mid;
    }
    double minimum(double n1,double n2,double n3)
    {
        double min;
        
        if(n1<n2 && n1<n3)
        min=n1;
        else if(n2<n1 && n2<n3)
        min=n2;
        else
        min=n3;
        
        return min;
    }
}