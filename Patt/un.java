package Patt;
class un
{ 
    public static void main(String args[])
    {
        System.out.println();
        char un[][]=new char[2][13];
        char x='A';
        
        for(int i=0;i<13;i++)
        {
            if(i%2==0)
            for(int j=0;j<2;j++)
            un[j][i]= x++;
            else
            for(int k=1;k>=0;k--)
            un[k][i]= x++;
        }
        
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<13;j++)
            System.out.print(un[i][j]+" ");
        
            System.out.println();
        }
    }
}