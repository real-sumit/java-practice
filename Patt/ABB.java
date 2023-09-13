package Patt;
class ABB
{
    public static void main(String [] args)
    {
        char a='A',b='B';
        int bs=5;
        for(int i=1;i<=4;i++)
        {
           for(int j=i;j<bs;j++)
           System.out.print(" ");
            
           for(int k=1;k<=i;k++)
           if(i%2==0)
           System.out.print(b+" ");
           else
           System.out.print(a+" ");
          
           bs--;
           System.out.println();
        }
    }
}