package Theory;
import java.util.Scanner;

class reverse
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter size of first array : ");
        int n=sc.nextInt();
        
        int ar[]=new int[n];
        int rev[]=new int[n];
        
        System.out.println("Enter elements of first array : ");
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        
        for(int i=0,j=n-1;i<n || j>=0;i++,j--)
        rev[i]=ar[j];
        
        System.out.println("Array elements after replacement : ");
        for(int i=0;i<n;i++)
        System.out.println(rev[i]+" ");
    }
}