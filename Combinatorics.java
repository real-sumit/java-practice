import java.util.*;

class Combinatorics {
	
    int fact(int n) {
    	
        int i=1,f=1;
        while(i<=n) {
            f=f*i;
            i++;
        }        
        
        return f;
    }
    public static void main(String args[]) {
    	
        Combinatorics ob=new Combinatorics();
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the no of objects : ");
        int n=sc.nextInt();
        
        System.out.print("Enter the no of objects that will be selected : ");
        int r=sc.nextInt();
        sc.close();
        
        int p=ob.fact(n)/ob.fact(n-r);
        int c=p/ob.fact(r);
        
        System.out.println("Permutations possible : "+p);
        System.out.println("Combinations possible : "+c);
    }
}