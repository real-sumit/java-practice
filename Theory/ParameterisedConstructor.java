package Theory;
class ParameterisedConstructor
{
    //class to use parameterised constructor
    int a,b;
    ParameterisedConstructor(int x,int y)
    {
        a=x;
        b=y;
    }
    void display()
    {
        System.out.println("The value of a is "+a+" and the value of b is "+b);
    }
}