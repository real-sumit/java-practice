class non_zero_no
{
    public static void main(int n)
    {
        System.out.println("Number : "+n);
        
        int rem,c=0;
        double sum=0;
                
        while(n>0)
        {
            rem=n%10;
            sum=sum+(double)(rem*Math.pow(10,c));
            if(rem!=0)           
            c++;
            n=n/10;
        }
        
        System.out.println("Number after removing zeroes : "+(int)sum);
    }
}