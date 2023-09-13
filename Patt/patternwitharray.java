package Patt;
class patternwitharray
{
    public static void main(String[] args)
    {
        char a[]={'C','O','N','V','E','N','T'};

        for(int i=0;i<7;i++)
        {
            for(int j=i;j>=0;j--)
            System.out.print(a[j]);
            
            System.out.println();
        }
    }
}