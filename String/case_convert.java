package String;
import java.io.*;

class case_convert
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader ii=new InputStreamReader (System.in);
        BufferedReader bb=new BufferedReader (ii);
        
        System.out.print("Enter the word : ");
        String str=bb.readLine();
        
        String st="";
        char ch;
        
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(Character.isUpperCase(ch))
            st=st+Character.toLowerCase(ch);
            else if(Character.isLowerCase(ch))
            st=st+Character.toUpperCase(ch);
            else
            st=st+ch;
        }
        System.out.println("The string after altering the case : "+st);
    }
}