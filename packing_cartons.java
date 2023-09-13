
import java.util.*;

public class packing_cartons {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no of boxes ");//this must not exceed 1000
		int n = sc.nextInt();
		
		int cs[] = {48,24,12,6};		//cs represents carton size
		int c[] = {0,0,0,0};			//c represents no of cartons
		int i=0;
		
		if(n<=1000) {
			while(n>6) {				//while to break boxes into cartons
				c[i]=n/cs[i];
				n=n%cs[i];
				i++;
			}
		}
		else
			System.out.println("We cannot pack more than 1000 cartons");
		
		if(i>0)
			for(i=0;i<=3;i++)
				if(c[i]!=0)
					System.out.println(c[i]+" x "+c[i]+" = "+c[i]*c[i]);
		
		System.out.println("Remaining boxes : "+n);
		System.out.println("Total no of boxes : "+(c[0]+c[1]+c[2]+c[3]));
	}
}