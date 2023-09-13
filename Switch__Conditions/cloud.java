package Switch__Conditions;
import java.io.*;

class cloud
{
    public static void main()throws IOException
    {
        InputStreamReader ii=new InputStreamReader(System.in);
        BufferedReader bb=new BufferedReader(ii);
      
        System.out.println("ENTER ALTITUDE IN METER :");
        int c=Integer.parseInt(bb.readLine());
            
        if(c>=400 && c<=2000)
        {
            System.out.println("LOW ALTITUDE CLOUDS ARE :");
            System.out.println("Stratus");
            System.out.println("Nimbostratus");
            System.out.println("Cumulus");
            System.out.println("Stratocumulus");
            System.out.println("Cumulonimbus");
        }
        else if(c>=2001 && c<=6000)
        {
            System.out.println("MEDIUM ALTITUDE CLOUDS ARE :");
            System.out.println("Altostratus");
            System.out.println("Altocumulus");
        }
        else if(c>=6001 && c<=12000)
        {
            System.out.println("HIGH ALTITUDE CLOUDS ARE :");
            System.out.println("Cirrostratus");
            System.out.println("Cirrocumulus");
            System.out.println("Cirrus");
        }
        else
        System.out.println("No clouds are present");
    }
}