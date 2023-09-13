package Theory;
import java.util.Scanner;

class delete
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter size of first array : ");
        int n=sc.nextInt();
        
        int ar[]=new int[n];
        
        System.out.println("Enter elements of first array : ");
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        
        System.out.print("Enter position to be deleted : ");
        int p=sc.nextInt();
        
        for(int i=p+1;i<n;i++)
        ar[i-1]=ar[i];
        
        n=n-1;
        
        System.out.println("Array elements after deletion : ");
        for(int i=0;i<n;i++)
        System.out.println(ar[i]+" ");
    }
}