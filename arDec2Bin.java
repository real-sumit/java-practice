class arDec2Bin
{
    public static void main(int n)
    {
        System.out.print("Decimal Number : "+n);
        System.out.println();
        
        int b[]=new int[20];
        int c=0,rem;
        
        while(n>0)
        {
            rem=n%2;
            
            if(rem==1)
            b[c]=1;
            else
            b[c]=0;
            
            c++;
            n=n/2;
        }
        
        System.out.print("Binary Number : ");
        for(int i=c-1;i>=0;i--)
        System.out.print(b[i]);
    }
}