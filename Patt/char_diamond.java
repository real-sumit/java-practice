package Patt;
class char_diamond
{
    public static void main(String[] args)
    {
        int bs=4;char c='A';
      
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=bs;j++)
            System.out.print(" ");
            for(int k=1;k<=i;k++)
            System.out.print(c);
            for(int l=1;l<i;l++)
            System.out.print(c);
            System.out.println();
            bs--;
            c++;
        }
        bs=2;
        for(int i=3;i>=1;i--)
        {
            for(int j=1;j<=bs;j++)
            System.out.print(" ");
            for(int k=1;k<=i;k++)
            System.out.print(c);
            for(int l=1;l<i;l++)
            System.out.print(c);
            System.out.println();
            bs++;
            c++;
        }
    }    
}
    