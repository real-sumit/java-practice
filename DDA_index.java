import java.util.*;

class DDA_index
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter size of the DDA : ");
        int n=sc.nextInt();
        sc.close();
        int x[][]=new int[n][n];
        
        System.out.println();
               
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            x[i][j]=(10*(i+1))+(j+1);
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print(x[i][j]+" ");
            
            System.out.println();
        }
    }
}