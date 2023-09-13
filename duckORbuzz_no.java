class duckORbuzz_no
{
    public static void main(int n)
    {
        System.out.println("Number : "+n);
        
        int n1=n,rem,z=0;
        
        for(;n>0;n=n/10)
        {
            if(n%10==0)
            z=1;
        }
        
        if(z==1)
        System.out.println(n1+" is a duck no.");
        
        if(n1%7==0 || n1/10==7)
        System.out.println(n1+" is a buzz no.");
    }
}        