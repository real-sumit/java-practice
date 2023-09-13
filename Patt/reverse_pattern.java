package Patt;

import java.util.*;
class reverse_pattern
{
    public static void main(String st[])
    {   
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter string");
    	String str=sc.next();
    	
        int l=str.length();
     
        for(int i=l-1;i>=0;i--)
        {
            for(int j=l-1;j>=i;j--)
            System.out.print(str.charAt(j));
                  
            System.out.println();
        }
    }
}
