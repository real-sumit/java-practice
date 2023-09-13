import java.util.*;

class twisted_coprime_nos {
	
    public static void main(String args[]) {
    	
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
                
        int m=0,c=0,n0=n;
        
        while(n>0) {
            m=m*10+n%10;
            n=n/10;
        }
        System.out.println("Reverse :\t"+m);
        
        for(int i=1;i<Math.min(m,n0);i++) {
            if(m%i==0 || n0%i==0)
            	c++;
        }
        
        if(c==1)
        	System.out.println(n0+" and "+m+" are twisted_co_prime numbers");
        else
        	System.out.println(n0+" and "+m+" are not twisted_co_prime numbers");
    }
}