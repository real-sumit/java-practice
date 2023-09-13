package Theory;
import java.util.Scanner;

class insert
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter size of first array : ");
        int n=sc.nextInt();
        
        int ar[]=new int[n+1];
        
        System.out.println("Enter elements of first array : ");
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        
        System.out.print("Enter element to be inserted : ");
        int e=sc.nextInt();
        System.out.print("Enter position to be inserted : ");
        int p=sc.nextInt();
        
        for(int i=n-1;i>=p;i--)
        ar[i+1]=ar[i];
        
        ar[p]=e;
        n=n+1;
        
        System.out.println("Array elements after insertion : ");
        for(int i=0;i<n;i++)
        System.out.println(ar[i]+" ");
    }
}