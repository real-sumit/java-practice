package String;
import java.io.*;

class piglatin
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader ii=new InputStreamReader (System.in);
        BufferedReader bb=new BufferedReader (ii);
        
        System.out.print("Enter a word : ");
        String s=bb.readLine();
        
        String str=s.toUpperCase(),str1="",str2="";
              
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                str1=str.substring(i);
                str2=str.substring(0,i);
                break;
            }
        }
        System.out.println("REAL FORM : "+s);
        System.out.println("PIGLATIN FORM : "+str1+str2+"AY");
    }
}