package Patt;
import java.io.*;

class pattern_with_word
{
    public static void main(String [] args) throws IOException
    {
        InputStreamReader ii=new InputStreamReader (System.in);
        BufferedReader bb=new BufferedReader (ii);
        
        System.out.print("Enter a word : ");
        String s=bb.readLine();
        
        String s1,s2;
        int l=s.length();
   
        for(int i=0;i<l;i++)
        {
            s1="";s2="";
            
            for(int j=i;j<l;j++)
            s1=s1+(s.charAt(j));
            
            System.out.print(s1);
            
            for(int k=0;k<i;k++)
            s2=s2+(s.charAt(k));
            
            System.out.print(s2);
            
            System.out.println();
        }
    }
}