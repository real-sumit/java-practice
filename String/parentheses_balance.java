package String;
import java.io.*;

class parentheses_balance
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader ii=new InputStreamReader (System.in);
        BufferedReader bb=new BufferedReader (ii);
        
        System.out.println("Enter parentheses :");
        String str=bb.readLine();
        
        int k=0;
        char ch;
              
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            
            if(ch=='(')
            k++;
            else if(ch==')')
            k--;
            
            if(k<0)
            {
                k=-1;
                break;
            }
        }
        
        if(k==0)
        System.out.println("Balenced parentheses");
        else
        System.out.println("Imbalenced parentheses");
    }
}