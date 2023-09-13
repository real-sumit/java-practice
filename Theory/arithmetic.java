package Theory;
class arithmetic
{
    public static void Unary(byte m,byte n)
    {
        m=8;                                      //Positive (+)                     
        m=+8;                                     //Positive (+)
        
        n=-10;                                    //negative (-)
    }
    public static void increment_decrement(short ri,short oi,short rd,short od)
    {
        System.out.println(++ri + oi++);
        System.out.println(ri++ - ++oi);
        System.out.println(++oi - ri++);
        System.out.println(oi++ + ++ri);
        System.out.println(++ri + oi++ - ri++ - ++oi + ++oi - ri++ - oi++ + ++ri);
        System.out.println(--rd - od--);
        System.out.println(rd-- + --od);
        System.out.println(--od + rd--);
        System.out.println(od-- - --rd);
        System.out.println(--rd - od-- + rd-- + --od - --od + rd-- + od-- - --rd);       
    }
    public static void binary(short a,short b)
    {
        System.out.println("a+b ="+ (a+b));       //Addition Operator
        System.out.println("a-b ="+ (a-b));       //Subtraction Operator
        System.out.println("a*b ="+ (a*b));       //Multiplication operator
        System.out.println("a/b ="+ (a/b));       //Division Operator
        System.out.println("a%b ="+ (a%b));       //Modulus Operator
    }
    public static void turnery(int x,int y)
    {
        int max,min;
      
        max=x>y?x:y;
        min=x<y?x:y;
      
        System.out.println("MAX :"+max);
        System.out.println("MIN :"+min);
    }
}