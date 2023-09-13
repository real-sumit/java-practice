package Patt;
class Floyd_t1
{
    public static void main(String[] args)
    {
        int i,j,k=11;
        
        for(i=1;i<=4;i++)
        {
            for(j=4;j>=i;j--)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println(" ");
        }
    }
}