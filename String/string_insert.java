package String;
import java.io.*;

class string_insert
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader ii=new InputStreamReader (System.in);
        BufferedReader bb=new BufferedReader (ii);
        
        System.out.print("Enter main string : ");
        String a=bb.readLine();
        
        System.out.print("Enter sub string to be inserted : ");
        String b=bb.readLine();
        
        System.out.println("D for Dynamic Insertion ");
        System.out.println("S for Static Insertion ");
        System.out.println("ENTER U'R CHOICE : ");
        String s=bb.readLine();
        
        String str="";
        
        switch(s)
        {
            case "S":
            
            System.out.println("Enter the position where string will be inserted :");
            int p=Integer.parseInt(bb.readLine());
            
            str=a.substring(0,p-1);
            str=str+b;
            str=str+a.substring(p-1);
            
            break;
            
            case "D":
            
            System.out.println("Enter the two positions where string will be inserted :");
            int p1=Integer.parseInt(bb.readLine());
            int p2=Integer.parseInt(bb.readLine());
        
            str=a.substring(0,p1-1);
            str=str+b;
            str=str+a.substring(p2);
            str=str+a.substring(p1-1,p2);
                        
            break;
        }
        System.out.println(str);
    }
}