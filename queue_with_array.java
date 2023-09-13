
import java.util.Scanner;

public class queue_with_array {
	int ST[];											//array to implement queue
	int size;											//maximum size of the queue
	int last=-1;										//index of topmost element(queue Pointer)
		
	queue_with_array(int x){
		size=x;
		ST=new int[size];
	}
		
	void push(int n) {									//function to insert element in queue
		if(last==size-1)								//condition for overflow
			System.out.println("overflow");
		else {
			last++;
			ST[last]=n;									//storing value in queue
		}
	}
	
	void pop() {										//function to delete element in queue
		if(last==-1)									//condition for underflow
			System.out.println("underflow");
		else {
			for(int i=1;i<=last;i++)					//storing the element which will be removed
				ST[i-1]=ST[i];
			last--;
		}
	}
		
	void display() {
		if(last==-1)
			System.out.println("the queue is empty");
		else {
			System.out.println("the elements of queue are");
			for(int i=last;i>=0;i--)
				System.out.println(ST[i]);
		}
	}
		
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
			
		System.out.println("Enter size : ");
		int x=sc.nextInt();
		
		queue_with_array ob=new queue_with_array(x);
		
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
