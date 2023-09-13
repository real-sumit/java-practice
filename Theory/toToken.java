package Theory;
import java.util.Scanner;

class toToken
{
    public static void main(String args[])
    {
        String s="A quick brown fox jumps over the lazy dog";
        Scanner sc=new Scanner(s).useDelimiter("\\s* \\s*");
        
        String a[]=new String[9];
        
        for(int i=0;i<9;i++)
        a[i]=sc.next();
        
        System.out.println("The tokens of the string are");
        for(int i=0;i<9;i++)
        System.out.print(a[i]+"\t");
    }
} 