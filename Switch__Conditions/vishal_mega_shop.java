package Switch__Conditions;
import java.util.*;
public class vishal_mega_shop 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		double price=0.0;
		
		System.out.println("Enter your choice");
		System.out.println("M/K/L FOR MENS/KIDS/LADIES");
		char ch=sc.next().charAt(0);
		
		switch(ch) {
		case 'M':
			System.out.println("Enter your type (A/B/C)");
			char c1=sc.next().charAt(0);
			switch(c1) {
			case 'A':
				System.out.println("Item : Jeans");
				break;
				
			case 'B':
				System.out.println("Item : The Shirts");
				break;
				
			case 'C':
				System.out.println("Item : Full Shirts");
				break;
				
			default :
				System.out.println("Dont press shit");
			}
			break;
			
		case 'K':
			System.out.println("Enter your type (A/B/C)");
			char c2=sc.next().charAt(0);
			switch(c2) {
			case 'A':
				System.out.println("Item : Baba Suit");
				break;
				
			case 'B':
				System.out.println("Item : Jeans Suit");
				break;
				
			case 'C':
				System.out.println("Item : Cotton Suit");
				break;
				
			default :
				System.out.println("Dont press shit");
			}
			break;
			
		case 'L':
			System.out.println("Enter your type (A/B/C)");
			char c3=sc.next().charAt(0);
			switch(c3) {
			case 'A':
				System.out.println("Item : Salwar Suit");
				break;
				
			case 'B':
				System.out.println("Item : Shirt");
				break;
				
			case 'C':
				System.out.println("Item : Jeans");
				break;
				
			default :
				System.out.println("Dont press shit");
			}
			break;
			
		default :
			System.out.println("Dont press shit");
			
		}
		
	}

}
