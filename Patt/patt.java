package Patt;
public class patt
{
    public static void main(String args[]){
        int j,k;
        for(int i=1;i<=4;i++){
            j=1;
            k=4;
            while(j<i){
                System.out.print("  ");
                j++;
            }
            while(k>=i){
                System.out.print("*"+" ");
                k--;
            }
            System.out.println(" ");
        }
    }
}