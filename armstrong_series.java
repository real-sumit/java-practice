class armstrong_series
{
    public static void main()
    {
        int n,rem,s=0;
        
        System.out.println("All armstrong numbers are :");
        for(int i=1;i<=500;i++)
        {
            n=i;s=0;
            while(n>0)
            {
                rem=n%10;
                s=s+(rem*rem*rem);
                n=n/10;
            }
        
            if(s==i)
            System.out.println(i);
        }
    }
}
