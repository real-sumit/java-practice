package String;
import java.io.*;

class sentence_reverse
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader ii=new InputStreamReader (System.in);
        BufferedReader bb=new BufferedReader (ii);
        
        System.out.println("Enter a sentence :");
        String str=bb.readLine()+" ";
        
        char ch;
        String st1="",st2="";
        String str1="",str2="",str3="";
        System.out.println();
              
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch==' ')                          //ASCII value of space is 32
            {
                str1=st1+" "+str1;
                str2=str2+st2+" ";
                str3=st2+" "+str3;
                
                st1="";st2="";
            }
            else
            {
                st1=st1+ch;
                st2=ch+st2;               
            }
        }
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}