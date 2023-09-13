import java.util.*;

class unlimited_sum
{
    static int ar[]={0,0,0,0};
    public static void main(String[] args)
    {
        unlimited_sum ob=new unlimited_sum();
        
        ob.usum();
        System.out.println("SUM OF POSITIVE EVEN NUMBERS : "+ar[0]);
        System.out.println("SUM OF POSITIVE ODD NUMBERS : "+ar[1]);
        System.out.println("SUM OF NEGATIVE EVEN NUMBERS : "+ar[2]);
        System.out.println("SUM OF NEGATIVE ODD NUMBERS : "+ar[3]);
    }
    void usum()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter nos continuously :");
        int n=sc.nextInt();
        
        while(n!=0)
        {
            if(n>0 && n%2==0)
            ar[0]=ar[0]+n;
            
            if(n>0 && n%2==1)
            ar[1]=ar[1]+n;
            
            if(n<0 && n%2==0)
            ar[2]=ar[2]+n;
            
            if(n<0 && n%2==1)
            ar[3]=ar[3]+n;
            
            if(n==0)
            break;
            
            n=sc.nextInt();
        }
    }
}