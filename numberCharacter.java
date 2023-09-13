import java.io.IOException;
import java.util.*;

public class numberCharacter {
	String fromString(String st) {
		String str="";
        char ch1,ch2;
        int c=1;
        
        for(int i=0;i<st.length()-1;i++)
        {
            ch1=st.charAt(i);
            ch2=st.charAt(i+1);
            
            if(ch1==ch2)
            c++;
            else
            {
                str=str+Integer.toString(c)+ch1;
                c=1;
            }
        }
        
        return str;
	}
	String toString(String nc) {
		
		String str="",d="";
        char ch;
        int n;
        
        for(int i=0;i<nc.length();i++)
        {
            ch=nc.charAt(i);
            if(Character.isDigit(ch)==true)
            d=d+ch;
            else if(Character.isLetter(ch)==true)
            {
                n=Integer.parseInt(d);
                d="";
                for(int j=1;j<=n;j++)
                str=str+ch;
            }
        }
        
        return str;
	}
	public static void main(String args[]) throws IOException {
		
		numberCharacter ob=new numberCharacter();
		
		Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter your choice(1/2)");
        System.out.println("1 for String to NumberCharacter");
        System.out.println("2 for NumberCharacter to String");
        char ch=(char)System.in.read();
        
        /* NumberCharacter is type of string where a character
         *  is written followed by a character.
         */
        switch(ch) {
        case '1':
        	System.out.print("Enter the string : ");
            String st=sc.next();
            
            System.out.println(ob.fromString(st));
        	break;
        case '2':
        	System.out.print("Enter the numbercharacter : ");
            String nc=sc.next();
            
            System.out.println(ob.toString(nc));
        	break;
        default:
        	System.out.println("Nothing else");
        }
	}
}
