class all_special_2digit_nos
{
    public static void main(String args[])
    {
        int dup,s,p;
        
        for(int i=1;i<100000;i++) {
        	s=0;
        	p=1;
        	dup=i;
        	while(dup>0)
        	{
        		s=s+dup%10;
        		p=p*(dup%10);
        		dup=dup/10;
        	}
        	
        	if((s+p)==i)
                System.out.println(i+" ");
        }
    }
}