package Theory;
class CopyConstructor
{
    //class to use parameterised and copy constructor
    int a,b;
    CopyConstructor(int x,int y)
    {
        a=x;
        b=y;
    }
    public static void main()
    {
        CopyConstructor ob=new CopyConstructor(2,5);
        CopyConstructor ob0=ob; //Initialising ob0 through ob
    }
}