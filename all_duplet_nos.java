class all_duplet_nos
{
    public static void main(String args[])
    {
        int ones,tens;
        
        for(int i=10;i<100;i++)
        {
            ones=i%10;
            tens=i/10;
            
            if((2*tens)==ones)
            System.out.println(i);
            if(tens==(2*ones))
            System.out.println(i);
        }
    }
}