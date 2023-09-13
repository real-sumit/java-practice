package Maths;
class hcf_lcm
{
    int x,y;
    int hcf,lcm;
    hcf_lcm(int a,int b)
    {
        x=a;
        y=b;
        hcf=0;
        lcm=(x*y)/hcf;
    }
    void calculate()
    {
        for(int i=1;i<=Math.min(x,y);i++)
        {
            if(x%i==0 && y%i==0)
            hcf=i;
        }
    }
    void print()
    {
        System.out.println("Highest Common Factor(HCF): "+hcf);
        System.out.println("Lowest Common Multiple(LCM): "+lcm);
    }
    public void main()
    {
       hcf_lcm ob=new hcf_lcm(x,y);
       
       ob.calculate();
       ob.print();
    }
}