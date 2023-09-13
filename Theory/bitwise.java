package Theory;
class bitwise
{
    public static void main(int x,int y)
    {
        System.out.println(x&y);    //Bitwise AND Operator (&)
        System.out.println(x|y);    //Bitwise OR Operator (|)
        System.out.println(x^y);    //Bitwise XOR Operator (^)
        System.out.println(~x);     //Bitwise Unary Complement Operator (~)
        System.out.println(~y);     //Bitwise Unary Complement Operator (~)
        System.out.println(x>>y);   //Signed Right Shift Operator (>>)
        System.out.println(x<<y);   //Signed Left Shift Operator (<<)
        System.out.println(x>>>y);  //Unsigned Right Shift Operator (>>>)
        System.out.println(y>>x);   //Signed Right Shift Operator (>>)
        System.out.println(y<<x);   //Signed Left Shift Operator (<<)
        System.out.println(y>>>x);  //Unsigned Right Shift Operator (>>>)
                                        //Unsigned Right Shift Operator (<<<)
    }
}
