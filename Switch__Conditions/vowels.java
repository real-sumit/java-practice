package Switch__Conditions;

import java.util.Scanner;

public class vowels
{
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Size : ");
        String str=sc.nextLine();
        
        int l=str.length();
        char ch1;
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='A')
            {
                ch1=++ch;
                System.out.print(ch1);
            }
            if(ch=='e'||ch=='E')
            {
                ch1=++ch;
                System.out.print(ch1);
            }
            if(ch=='i'||ch=='I')
            {
                ch1=++ch;
                System.out.print(ch1);
            }
            if(ch=='o'||ch=='O')
            {
                ch1=++ch;
                System.out.print(ch1);
            }
            if(ch=='u'||ch=='U')
            {
                ch1=++ch;
                System.out.print(ch1);
            }
           else
                System.out.print(ch);
        }
    }
}