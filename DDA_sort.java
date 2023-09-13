import java.util.Scanner;

class DDA_sort
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter size of the DDA : ");
        int n=sc.nextInt();
        
        int ar[][]=new int [n][n];
        int t=0;
       
        System.out.println("Enter the elements of the DDA accordingly :");       
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            ar[i][j]=sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print(ar[i][j]+" ");
            
            System.out.println();
        }
        System.out.println();
        for(int k=0;k<n;k++)
        {
            for(int l=0;l<n;l++)
            {
                for(int p=0;p<n;p++)
                {
                    for(int q=0;q<n;q++)
                    {
                        if( ar[k][l]>ar[p][q])
                        {
                            t=ar[k][l];
                            ar[k][l]=ar[p][q];
                            ar[p][q]=t;
                        }
                    }
                }
            }
        }
         
                
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print(ar[i][j]+" ");
           
            System.out.println();
        }
    }
}