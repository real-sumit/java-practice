package Theory;

class for_variations
{
    public static void variation1(int i,int n)
    {
        for(;;)
        {
            System.out.println(i);
            if(i==n)
            break;            
            i++;            
        }
    }
    public static void variation2(int n)
    {
        int j=1;
        for(int i=0;i<=n;i++,j++)
        System.out.println(i);       
    }
    public static void variation3(int n)
    {
        for(;;)
        System.out.println(n);            
    }
}