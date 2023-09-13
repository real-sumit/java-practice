import java.util.*;

class dice
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter no of times the dice will be rolled : ");
        int n=sc.nextInt();
        
        int p[]=new int[7];
        int c=0,sum;
        double pt;
        
        for(int i=1;i<=n;i++)
        {
            pt=0.0;
            sum=0;
            
            for(int j=1;j<=6;j++)
            pt=pt+Math.random();
            
            sum=(int)Math.rint(pt);
            ++p[sum+1];
        }
        
        for(int i=1;i<=6;i++)
        System.out.println("No of times "+i+" obtained : "+p[i]);
    }
}