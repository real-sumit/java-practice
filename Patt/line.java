package Patt;
class line
{
    public static void main(String[] args)
    {
        char ch='A';
        for(int i=1;i<=1;i++)
        {
            for(int j=1;j<=4;j++)
            System.out.print(ch++ +" ");
            
            System.out.print("  ");
            
            for(int k=1;k<=4;k++)
            System.out.print(--ch +" ");
        }
        System.out.println();
        for(int i=1;i<=5;i++)
        {
            {
                for(int j=1;j<=5;j++)
                System.out.print(j+" ");
         
                for(int k=4;k>=1;k--)
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}