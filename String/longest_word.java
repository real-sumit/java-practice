package String;
import java.io.*;

class longest_word
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader ii=new InputStreamReader (System.in);
        BufferedReader bb=new BufferedReader (ii);
        
        System.out.println("Enter a sentence :");
        String str=bb.readLine()+" ";
        
        int l=0,k=0;
        char ch;
        String st="",s="";
              
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch==' ')
            {
                if(k>l)
                {
                    l=k;
                    s=st;
                }
                st="";
                k=0;
            }
            else
            {
                k++;
                st=st+ch;
            }
        }
        System.out.println("The longest word is : "+s);
    }
}