import java.util.Scanner;

class nos_seperation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter size of the array : ");
        int n=sc.nextInt();
        
        int no[]=new int[n];
        int sno[]=new int[n];
        int c=0;
        
        System.out.println("Enter elements in the array : ");
        for(int i=0;i<n;i++)
        no[i]=sc.nextInt();
        
        for(int i=0;i<n;i++)
        if(no[i]%2==0 && no[i]<0)
        {
            sno[c]=no[i];
            c++;
        }
        
        for(int i=0;i<n;i++)
        if(no[i]%2==1 && no[i]<0)
        {
            sno[c]=no[i];
            c++;
        }
        
        for(int i=0;i<n;i++)
        if(no[i]%2==1 && no[i]>0)
        {
            sno[c]=no[i];
            c++;
        }
        
        for(int i=0;i<n;i++)
        if(no[i]%2==0 && no[i]>0)
        {
            sno[c]=no[i];
            c++;
        }
        
        System.out.println("Array elements after seperation : ");
        for(int i=0;i<n;i++)
        System.out.print(sno[i]+" ");
    }
}