class noDec2Bin
{
    public static void main(int n)
    {
        System.out.println("Decimal Number : "+n);
        
        int rem,sum=0,e=0;
                
        while(n>0)
        {
            rem=n%2;
            sum=sum+(int)(rem*Math.pow(10,e));
            e++;
            n=n/2;
        }
        
        System.out.println("Binary Number : "+sum);
    }
}