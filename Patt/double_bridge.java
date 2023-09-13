package Patt;
class double_bridge
{
    public static void main(String[] args)
    {
        for(int i=1;i<=4;i++)
        {
            char c='A';
            
            for(int j=4;j>=i;j--)
            System.out.print(c++ + " ");
            
            --c;
            
            for(int k=2;k<=i;k++)
            System.out.print("  ");
            
            for(int l=2;l<=i;l++)
            System.out.print("  ");
            
            for(int m=4;m>=i;m--)
            System.out.print(--c + " ");
            
            System.out.println();
        }
        
        for(int ii=2;ii<5;ii++)
        {
            char c='A';
            
            for(int jj=1;jj<=ii;jj++)
            System.out.print(c++ + " ");
            
            --c;
            
            for(int kk=4;kk>ii;kk--)
            System.out.print("  ");
            
            for(int ll=4;ll>ii;ll--)
            System.out.print("  ");
             
            for(int mm=1;mm<=ii;mm++)
            System.out.print(--c + " ");
            
            System.out.println();
         }
    }
}