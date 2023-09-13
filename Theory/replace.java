package Theory;
import java.util.Scanner;

class replace
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
        
        System.out.print("Enter element to be replaced : ");
        int e=sc.nextInt();
        System.out.print("Enter position to be replaced : ");
        int p=sc.nextInt();
        
        ar[p]=e;
        
        System.out.println("Array elements after replacement : ");
        for(int i=0;i<n;i++)
        System.out.println(ar[i]+" ");
    }
}