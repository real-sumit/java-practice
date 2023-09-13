import java.util.Scanner;

class school
{
    public void ascii(int n)
    {
        for(int i=0;i<n;i++)
            System.out.println(i+"\t"+(char)i);
    }
    public void factor(int m)
    {
        int i;
                
        System.out.println("Factors of "+m);
        for(i=1;i<=m;i++)
        {
            if(m%i==0)
            System.out.println("\t"+i);
        }
    }
    public int reverse(int m)
    {
        int sum=0;
        
        while(m>0)
        {
            sum=(sum*10)+(m%10);
            m=m/10;
        }
        
        return (int)sum;
    }
    public static void main(String args[])
    {
    	school ob=new school();
        
    	Scanner sc=new Scanner(System.in);
        System.out.println("Number\t: ");
        int n=sc.nextInt();
        
        ob.ascii(n);
        System.out.println("Factors of n ");
        ob.factor(n);
        System.out.println("Reverse of "+n+" : "+ob.reverse(n));
    }
}