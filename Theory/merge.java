package Theory;
import java.util.Scanner;

class merge
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter size of first array : ");
        int n1=sc.nextInt();
        int ar1[]=new int[n1];
        System.out.println("Enter elements of first array : ");
        for(int i=0;i<n1;i++)
        ar1[i]=sc.nextInt();
        
        System.out.print("Enter size of second array : ");
        int n2=sc.nextInt();
        int ar2[]=new int[n2];
        System.out.println("Enter elements of second array : ");
        for(int i=0;i<n2;i++)
        ar2[i]=sc.nextInt();
        
        int ar[]=new int[n1+n2];
        
        //Merging both arrays
        for(int i=0;i<n1;i++)
        ar[i]=ar1[i];
        for(int i=0;i<n2;i++)
        ar[n1+i]=ar2[i];
        
        System.out.println("Array elements after merging : ");
        for(int i=0;i<(n1+n2);i++)
        System.out.println(ar[i]+" ");
    }
}