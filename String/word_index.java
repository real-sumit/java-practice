package String;
import java.io.*;

class word_index
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader ii=new InputStreamReader (System.in);
        BufferedReader bb=new BufferedReader (ii);
        
        System.out.println("Enter a sentence : ");
        String str=bb.readLine();
        
        System.out.print("Enter word index : ");
        int e=Integer.parseInt(bb.readLine());
        
        str=str+" ";
        int c=0;
        char ch;
        String st="";        
        
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            
            if(ch==32)
            {
                c++;
                if(e==c)
                System.out.println(st);
                st="";
            }
            else
            st=st+ch;
        }
    }
}