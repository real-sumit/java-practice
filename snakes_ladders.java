class snakes_ladders
{
    public static void main()
    {
        int n=0,m=0,c=0,che=2;
        double sum;
        
        while(n<100 || m<100)
        {
            sum=0.0;
            for(int i=1;i<=6;i++)
            sum=sum+Math.rint(Math.random());
            
            if(c==0)
            {
                n=n+(int)sum;                
                System.out.print("Player 1 score : "+n);
                
                if(n==5)        n=48;
                else if(n==9)   n=30;
                else if(n==20)  n=39;
                else if(n==25)  n=58;
                else if(n==32)  n=8;
                else if(n==36)  n=95;
                else if(n==41)  n=79;
                else if(n==42)  n=16;
                else if(n==49)  n=71;
                else if(n==52)  n=11;
                else if(n==61)  n=3;
                else if(n==64)  n=99;
                else if(n==68)  n=4;
                else if(n==69)  n=94;
                else if(n==82)  n=22;
                else if(n==89)  n=50;
                else if(n==93)  n=18;
                else if(n==97)  n=12;
                
                if(n>100)
                n=n-(int)sum;
                System.out.println("\t"+n);
                
                c++;
            }
            else
            {
                m=m+(int)sum;
                System.out.print("Player 2 score : "+m);
                
                if(m==5)        m=48;
                else if(m==9)   m=30;
                else if(m==20)  m=39;
                else if(m==25)  m=58;
                else if(m==32)  m=8;
                else if(m==36)  m=95;
                else if(m==41)  m=79;
                else if(m==42)  m=16;
                else if(m==49)  m=71;
                else if(m==52)  m=11;
                else if(m==61)  m=3;
                else if(m==64)  m=99;
                else if(m==68)  m=4;
                else if(m==69)  m=94;
                else if(m==82)  m=22;
                else if(m==89)  m=50;
                else if(m==93)  m=18;
                else if(m==97)  m=12;
                
                if(m>100)
                m=m-(int)sum;
                System.out.println("\t"+m);
                
                c--;
                System.out.println();
            }
            
            if(n==100)
            {
                che=0;
                break;
            }
            else if(m==100)
            {
                che=1;
                break;
            }
        }
        
        if(n==100 && che==0)
        System.out.println("Player 1 is winner ");
        else if(m==100 && che==1)
        System.out.println("Player 2 is winner ");
        else if(m==n)
        System.out.println("Both players are winners ");
    }
}