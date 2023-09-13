import java.io.*;

class smallest_largest
{
    public static void main(String [] args)throws IOException
    {
        InputStreamReader rr=new InputStreamReader(System.in);
        BufferedReader bb=new BufferedReader(rr);

        System.out.println("ENTER FIRST NUMBER=");
        String v1=bb.readLine();
        int a=Integer.parseInt(v1);

        System.out.println("ENTER SECOND NUMBER=");
        String v2=bb.readLine();
        int b=Integer.parseInt(v2);

        System.out.println("ENTER THIRD NUMBER=");
        String v3=bb.readLine();
        int c=Integer.parseInt(v3);

        System.out.println("ENTER FOURTH NUMBER=");
        String v4=bb.readLine();
        int d=Integer.parseInt(v4);

        if((a>b) && (a>c) && (a>d))
        System.out.println(a+" largest no.");
        else if ((a<b) && (a<c) && (a<d))
        System.out.println(a+" smallest no.");

        if((b>c) && (b>a) && (b>d))
        System.out.println(b+" largest no.");
        else  if((b<c) && (b<d) && (b<a))
        System.out.println(b+" smallest no.");

        if((c>d) && (c>b) && (c>a))
        System.out.println(c+" largest no.");
        else if((c<d) && (c<b) && (c<a))
        System.out.println(c+" smallest no.");

        if((d>a) && (d>b) && (d>c))
        System.out.println(d+" largest no.");
        else if((d<a) && (d<c) && (d<d))
        System.out.println(d+" smallest no.");

    }
}
