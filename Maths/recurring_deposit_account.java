package Maths;
import java.io.*;

class recurring_deposit_account
{
    public static void main() throws IOException
    {
        InputStreamReader ii=new InputStreamReader (System.in);
        BufferedReader ob=new BufferedReader (ii);
        
        System.out.println("Enter Principal :");
        double p=Double.parseDouble(ob.readLine());
        
        System.out.println("Enter Rate :");
        double r=Double.parseDouble(ob.readLine());
        
        System.out.println("Enter Number of Terms :");
        double n=Double.parseDouble(ob.readLine());
        
        double i=p*(r/100)*((n*(n+1))/(2*12));
        double mv=(p*n)+i;
        
        System.out.println("Total Amount Deposited : "+(p*n));
        System.out.println("Simple Interest is : "+i);
        System.out.println("Amount is : "+mv);
       } 
   }
