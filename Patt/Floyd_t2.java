package Patt;
class Floyd_t2
{
    public static void main(String[] args)
    {
        int i,j;
        int k=11;
        for(i=1;i<=4;i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print(k+" ");
                k=k+2;
            }
            System.out.println();
        }
    }
}