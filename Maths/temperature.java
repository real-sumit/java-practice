package Maths;
import java.io.*;

class temperature
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader ii= new InputStreamReader(System.in);
        BufferedReader bb= new BufferedReader(ii);
       
        System.out.println("Enter the choice (1/2/3/4/5/6): ");
        String m=bb.readLine();
        int a=Integer.parseInt(m);
       
        double c,f,k;
              
        switch(a)
        {
            case 1:
            System.out.println("ENTER TEMP. IN FAHRENHEIT TO CENTRIGRADE:");
            f=Double.parseDouble(bb.readLine());
            c=(f-32)*(5/9);
            System.out.println(c+"DEGREE CENTRIGRADE");
            break;
           
            
            case 2:
            System.out.println("ENTER TEMP. IN CENTRIGRADE TO FAHRENHEIT:");
            c=Double.parseDouble(bb.readLine());
            f=(9*c/5)+32;
            System.out.println(f+"DEGREE FAHRENHEIT");
            break;
           
           
            case 3:
            System.out.println("ENTER TEMP. IN CENTRIGRADE TO KELVIN:");
            c=Double.parseDouble(bb.readLine());
            k=c+273;
            System.out.println(k+"KELVIN");
            break;
           
            case 4:
            System.out.println("ENTER TEMP. IN KELVIN TO CENTRIGRADE");
            k=Double.parseDouble(bb.readLine());
            c=k-273;
            System.out.println(c+"DEGREE CENTRIGRADE");
            break;
           
            case 5:
            System.out.println("ENTER TEMP. IN FAHRENHEIT TO KELVIN");
            f=Double.parseDouble(bb.readLine());
            k=((5/9)*(f-32))+273;
            System.out.println(k+"DEGREE KELVIN");
            break;
           
            case 6:
            System.out.println("ENTER TEMP. IN KELVIN TO FAHRENHEIT");
            k=Double.parseDouble(bb.readLine());
            f=((9/5)*(k-273))+32;
            System.out.println(f+"DEGREE FAHRENHEIT");
            break;
           
            default:
            System.out.println("CONVERSION WILL NOT TAKE PLACE");
        }
    }
}