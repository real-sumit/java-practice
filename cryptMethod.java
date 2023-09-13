import java.io.*;
public class cryptMethod
{
    public static void main(String [] args) throws IOException
    {
        InputStreamReader ii=new InputStreamReader (System.in);
        BufferedReader bb=new BufferedReader (ii);
        
        System.out.print("Enter your name : ");
        String str=bb.readLine();
        
        char ch;
        int c,sum=0;
        System.out.print("Crypted word : ");
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            sum=sum+(int)ch;
            c=(int)ch+str.length();
            System.out.print((char)c);
        }
        System.out.print((char)sum);
    }
}