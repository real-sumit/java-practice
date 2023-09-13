class perfect_series {
	
    public static void main(String args[]) {
    	
        int i,j,n,sum;
        
        for(i=1;i<=100000;i++) {
            n=i;sum=0;
            for(j=1;j<i;j++) {
                if(i%j==0)
                sum+=j;
            }
            
            if(n==sum)
            System.out.println(n);
        }
    }
}