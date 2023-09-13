package Patt;
class spades
{
    public static void main(String[] args)
    {
        for( int i=1;i<=7;i++)
        System.out.print("* ");
        
        System.out.println();
        
        for(int j=1;j<=3;j++)
        {
            for(int k=3;k>=j;k--)
            System.out.print("* ");
            
            for(int l=2;l<=j;l++)
            System.out.print(" ");
            
            for(int  m=2;m<=j*3;m++)
            System.out.print(" ");
                
            for(int n=3;n>=j;n--)
            System.out.print("* ");
          
            System.out.println();
        }
        
        for(int m=1;m<=2;m++)
        {
            for(int n=1;n<=7;n++)
            {
                if(m==2 && n==4)
                System.out.print("  ");
                else if(m==1 && n==5)
                System.out.print("  ");
                else if(m==1 && (n==3 || n==4))
                System.out.print(" *");
                else
                System.out.print("* ");               
            }
            System.out.println();
        }
    }
}
