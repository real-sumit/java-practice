import java.util.Scanner;

class mid_no
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter the no : ");
       int n=sc.nextInt();
       
       int m,r1=0,n1=n,c=0;
       
       while(n>0)
       {
           c++;
           n=n/10;
       }
       
       m=(c+1)/2;
       
       for(int i=1;i<=m;i++)
       {
           r1=n1%10;
           n1=n1/10;
       }
       
       System.out.println("Mid no : "+r1);
   }
}