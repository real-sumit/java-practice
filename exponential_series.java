/*WAP in JAVA to find the sum of the series using function name fact(int a) which returns factorial of the number a.
S = 1+1/2!+1/3!+----------------------+1/n!

Program :
/*
 * 
 */
import java.io.*;
public class exponential_series
    {
        public static int fact(int a)
        {
            int prod=1;
            for(int i=1;i<=a;i++)
            {
                prod=prod*i;
            }
            return prod;
        }
        
        public static void main(String args[])throws IOException
        {
            InputStreamReader read = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(read);
            System.out.println("Enter the limit");
            int n = Integer.parseInt(in.readLine());
            double s=0;
            for(int j=1;j<=n;j++)
            {
                s=(double)1/fact(j);
            }
            
            System.out.println("The Sum of The Series is = "+s);
        }
    }