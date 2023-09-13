class digit_operation
{
    public static void main(int n)
    {
        System.out.println("NUMBER : "+n);
        
        int c=0,rem,even=0,odd=0,sum=0;        
        for(int i=n;i>0;i=i/10)
        {
            rem=i%10;
            
            if(rem%2!=1)
            even++;
            else
            odd++;            
            
            sum=sum+rem;
            c++;
        }
        
        System.out.println("Total digit in number : "+c);
        System.out.println("Total no. even digit : "+even);
        System.out.println("Total no. odd digit : "+odd);
        System.out.println("Sum of all digits : "+sum);
    }
}