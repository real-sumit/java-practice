package Patt;
class VA
{ 
    public static void main(String args[])
    {
        System.out.println();
        char zz[][]=new char[2][26];
        char ch='A';
        int flag=1;
        
        for(int i=0;i<26;i++)
        {
            if(flag==1)
            {
                zz[0][i]= ch++;
                flag=0;
            }
            else
            {
                zz[1][i]= ch++;
                flag=1;
            }
        }
        
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<26;j++)
            System.out.print(zz[i][j]+" ");
        
            System.out.println();
        }
    }
}