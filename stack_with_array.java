
import java.util.Scanner;

public class stack_with_array {
	int ST[];											//array to implement stack
	int size;											//maximum size of the stack
	int top=-1;											//index of topmost element(Stack Pointer)
	
	stack_with_array(int x){
		size=x;
		ST=new int[size];
	}
	
	void push(int n) {									//function to insert element in stack
		if(top==size-1)									//condition for overflow
			System.out.println("overflow");
		else {
			top++;
			ST[top]=n;									//storing value in stack
		}
	}
	
	void pop() {										//function to delete element in stack
		if(top==-1)										//condition for underflow
			System.out.println("underflow");
		else {
			ST[top]=0;									//storing the element which will be removed
			top--;
		}
	}
	
	void display() {
		if(top==-1)
			System.out.println("the stack is empty");
		else {
			System.out.println("the elements of stack are");
			for(int i=top;i>=0;i--)
				System.out.println(ST[i]);
		}
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size : ");
		int x=sc.nextInt();
		
		stack_with_array ob=new stack_with_array(x);
		
		System.out.println("Enter your opinion (0 for pop and 1 for push) : ");
		int c=sc.nextInt();
		
		while(c==0 || c==1) {
			if(c==1) {
				System.out.println("Enter your number : ");
				x=sc.nextInt();
				ob.push(x);
			}
			else if(c==0) {
				ob.pop();
			}
			else {
				System.out.println("Invalid input");
				break;
			}
			
			System.out.println("Enter your opinion (0 for pop and 1 for push) : ");
			c=sc.nextInt();
		}
		
		ob.display();
		sc.close();
	}
}