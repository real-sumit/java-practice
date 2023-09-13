package String;
import java.io.*;

class consecutive_pair
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader ii=new InputStreamReader (System.in);
        BufferedReader bb=new BufferedReader (ii);
        
        System.out.println("Enter a sentence :");
        String str=bb.readLine();
        
        int c=0;
        char ch1,ch2;
              
        for(int i=0;i<str.length()-1;i++)
        {
            ch1=str.charAt(i);
            ch2=str.charAt(i+1);
            if((int)ch1+1==(int)ch2)
            c++;
        }
        System.out.println("The no of consecutive pairs : "+c);
    }
}