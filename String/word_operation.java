package String;
import java.io.*;

class word_operation
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader ii=new InputStreamReader (System.in);
        BufferedReader bb=new BufferedReader (ii);
        
        System.out.print("Enter a word :");
        String s=bb.readLine();
        
        char fl=s.charAt(0);
        char ll=s.charAt(s.length()-1);
        
        String str="";
        int v=0,c=0;
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            str=ch+str;
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            ++v;
            else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            ++v;
            else
            ++c;
        }
        
        System.out.println();
        System.out.println("The first letter : "+fl);
        System.out.println("The last letter : "+ll);
        System.out.println("Number of vowels present : "+v);
        System.out.println("Number of consonants present : "+c);
        System.out.println("Reverse word : "+str);
    }
}