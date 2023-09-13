package String;

import java.util.*;
public class Exchange
{
	String sent;
	String rev;
	
	Exchange()
	{
		sent="";
		rev="";
    }
    void readsentence()
    {
        Scanner ob=new Scanner(System.in);
       
        
        System.out.println("Enter the sentence:");
        sent=ob.nextLine();
    }
    void exfirstlast()
    {
        StringTokenizer st = new StringTokenizer (sent);
        while ( st.hasMoreTokens ())
        {
            String w = st.nextToken();
            int l = w. length();
            rev = rev +w.charAt(l-1)+ w.substring(1,l-1)+ w.charAt(0);
        }
        System.out.println(rev);
    }
    void display()
    {
    	System.out.println("The exchanged sentence is:"+ rev);
    }
    public static void main()
    {
        Exchange o=new Exchange();
        o.readsentence();
        o.exfirstlast();
        o.display();
    }
}

    
                
            
        
        