import java.util.Scanner;
/* A Prime-Adam integer is a positive integer (without leading zeros)
 * which is a prime as well as an Adam number
 */
public class Prime_Adam {
	
	void test(int m,int n) {
		Prime_Adam obj=new Prime_Adam();
		
		int c,freq=0;
		
		for(int i=m;i<=n;i++) {	//for loop for checking all numbers between bounds
			c=0;
			for(int j=2;j<i;j++)	//for loop for checking prime numbers
				if(i%j==0)
					c++;

			if(c==0) {
				int k=obj.reverse(i);	//reverse of prime number
				if((i*i)==obj.reverse(k*k)) {	//adam number check
					System.out.println(i);
					freq++;
				}
			}
		}
		System.out.println("Frequency of prime adam integers is : "+freq);
	}
	
	int reverse(int x) {
		int r=0;
		while(x>0) {
			r = 10*r+x%10 ;
			x=x/10;
		}
		return r;
	}
	
	public static void main(String[] args) {
		Prime_Adam ob=new Prime_Adam();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a lower bound");
		int m=sc.nextInt();
		
		System.out.println("Enter a upper bound");
		int n=sc.nextInt();
		
		if(m>n) {
			m=m+n;
			n=m-n;
			m=m-n;
		}
		
		System.out.println("The prime adam integers are : ");
		ob.test(m,n);
	}
}