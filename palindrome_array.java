import java.util.*;

class palindrome_array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the size of the array :");
        int l=sc.nextInt();
        
        int x[] =new int[l];
        int y[]=new int[l];
        int flag=0;
        
        System.out.println("Enter the nos in the array :");
        for(int i=0;i<l;i++)
        x[i]=sc.nextInt();
                   
        for(int i=0;i<l;i++)
        y[i]=x[l-i-1];
        
        for(int i=0;i<l;i++)
        {
            if(x[i]==y[i])
            flag=0;
            else
            {
                flag=1;
                break;
            }
        }
        
        if(flag==0)
        System.out.println("Palindrome_array");
        else
        System.out.println("not a palindrome array");
    }
}