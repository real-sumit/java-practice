import java.util.*;

public class Fibonacci_strings {
	String x,y,z;
	int n;
	     
	Fibonacci_strings() {
		x = "a";
		y = "b";
		z = "ba";
		// mentioned in the question otherwise not required
		// z = "" is sufficient
	}
	     
	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms : ");
		n = sc.nextInt();
	}
	     
	void generate() {
		System.out.println("The Fibonacci String Series is : ");
		if(n <= 1) // If no of terms is less than or equal to 1
			System.out.print(x);
		else {
			System.out.print(x+", "+y);
			for(int i=3; i<=n; i++) {
				z = y+x;
				System.out.print(", "+z);
				x = y;
				y = z;
			}
		}
	}
	     
	public static void main(String args[])
	{
		Fibonacci_strings ob = new Fibonacci_strings();
		ob.accept();
		ob.generate();
	}
}
