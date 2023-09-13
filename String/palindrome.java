package String;
import java.io.*;

class palindrome
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader ii=new InputStreamReader (System.in);
        BufferedReader bb=new BufferedReader (ii);
        
        System.out.print("Enter a palindrome :");
        String str=bb.readLine();
        
        String st="";
       
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            st=ch+st;
        }
        
        if(st.compareTo(str)==0)
        System.out.println(st+" is a palindrome");
        else if(str.charAt(0)==str.charAt(str.length()-1))
        System.out.println(st+" is a special word");
    }
}