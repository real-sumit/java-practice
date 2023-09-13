package Switch__Conditions;
import java.io.*;

class color
{
   public static void main(String[] args)throws IOException
   {
       InputStreamReader rr= new InputStreamReader(System.in);
       BufferedReader bb= new BufferedReader(rr);
             
       System.out.println("ENTER A NO:");
       String m=bb.readLine();
       int c=Integer.parseInt(m);
       
       switch(c)
       {
           case 1: System.out.println("VIOLET");
           break;
                    
           case 2: System.out.println("BLUE");
           break;
           
           case 3: System.out.println("GREEN");
           break;
           
           case 4: System.out.println("YELLOW");
           break;
           
           case 5: System.out.println("ORANGE");
           break;
           
           case 6: System.out.println("RED");
           break;
           
           default:
           System.out.println("INDIGO IS LEFT IN RAINBOW COLOURS");
        }
    }
}