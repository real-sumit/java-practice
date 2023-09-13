import java.util.*;

class factor_multiple
{
    void factor(int n)
    {
        System.out.println("The Factors are :");
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            System.out.println("\t"+i);
        }
    }
    void multiple(int a,int l)
    {
        System.out.println("The multiples are :");
        for(int i=a;i<=l;i=i+a)
        System.out.println("\t"+i);
    }
    public static void main()
    {
        factor_multiple ob=new factor_multiple();
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter your choice : ");
        int ch=sc.nextInt();
        
        switch(ch)
        {
            case 1:
            System.out.print("Enter a number for finding factors : ");
            int n=sc.nextInt();
            
            ob.factor(n);
            break;
            
            case 2:
            System.out.print("Enter a number for finding multiples : ");
            int a=sc.nextInt();
        
            System.out.print("Enter last number : ");
            int l=sc.nextInt();
        
            ob.multiple(a,l);
            break;
            
            default:
            System.out.println("No other operations");
        }
    }
}