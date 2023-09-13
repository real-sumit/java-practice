package String;
import java.util.*;

class char_sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a string : ");
        String str=sc.nextLine();
        
        String st="";
        char ch,c;
        
        for(int i=32;i<=128;i++)
        {
            ch=(char)i;
            
            for(int j=0;j<str.length();j++)
            {
                c=str.charAt(j);
                if(ch==c)
                st=st+c;
            }
        }
        
        System.out.print("Sorted String : "+st);
    }
}