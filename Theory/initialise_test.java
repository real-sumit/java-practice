package Theory;
class initialise_test
{
    public static void main()
    {
        byte b1=127 , b2=-128;
        short s1=32767 , s2=-32768;
        int i1=2147483647 , i2=-2147483648;
        long l1=999999999 , l2=-999999999;
        
        float f1=999999999 , f2=-999999999;
        double d1=999999999.999999999 , d2=-999999999.999999999;
        
        System.out.println(b1);      System.out.println(b2);
        System.out.println(s1);      System.out.println(s2);
        System.out.println(i1);      System.out.println(i2);
        System.out.println(l1);      System.out.println(l2);
        System.out.println(f1);      System.out.println(f2);
        System.out.println(d1);      System.out.println(d2);        
    }
}