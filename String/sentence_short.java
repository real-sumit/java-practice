package String;
import java.io.*;

class sentence_short
{
    public static void main(String [] args) throws IOException
    {
        InputStreamReader ii=new InputStreamReader (System.in);
        BufferedReader bb=new BufferedReader (ii);
        
        System.out.println("Enter a sentence : ");
        String str=bb.readLine();
        
        str=str+" ";
        char ch;
        String s="",st="",str1="";        
        
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            
            if(ch==32)
            {
                s=s+st.charAt(0);
                s=s+st.charAt(st.length()-1);
                str1=str1+s+" ";
                s="";
                st="";
            }
            else
            st=st+ch;
        }
        System.out.println(str1.toUpperCase());
    }
}