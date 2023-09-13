import java.util.*;

class type_prime_nos
{
    boolean prime(int x)
    {
        int c=0;
        
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            c++;
        }
        
        if(c==2)
        return true;
        else
        return false;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        
        System.out.println("Enter another number :");
        int m=sc.nextInt();
        
        type_prime_nos ob=new type_prime_nos();
        
        if((n-m==2 || m-n==2)&&(ob.prime(n) && ob.prime(m)))
        System.out.println("They are twin prime numbers");
        
        else if((n-m==4 || m-n==4)&&(ob.prime(n) && ob.prime(m)))
        System.out.println("They are cousin prime numbers");
        
        else if((n-m==6 || m-n==6)&&(ob.prime(n) && ob.prime(m)))
        System.out.println("They are sexy prime numbers");
        
        else
        System.out.println("No other types");
    }    
}