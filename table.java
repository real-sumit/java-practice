import java.util.*;

class table
{
    void addition()
    {
        for(int i=1;i<=9;i++)
        {
           for(int j=1;j<=i;j++)
           System.out.print(i+"+"+j+"="+(i+j)+" ");
               
           System.out.println();
        }
    }
    void multiplication()
    {
        for(int i=1;i<=9;i++)
        {
           for(int j=1;j<=i;j++)
           System.out.print(i+"x"+j+"="+(i*j)+" ");
               
           System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        table ob=new table();
        
        System.out.println("Enter your choice(+/*) : ");
        int ch=sc.next().charAt(0);
        
        switch(ch)
        {
            case '+':
            ob.addition();
            break;
            
            case '*':
            ob.multiplication();
            break;
            
            default:
            System.out.println("No other tables");
        }
    }
}