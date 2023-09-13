package Theory;

class callby_reference
{
    int data=2;
    void change(int data)
    {
        data=this.data*data;
    }
    public static void main(String args[])
    {
        callby_reference ob=new callby_reference();
        System.out.println("Before change : "+ob.data);
        ob.change(2);
        System.out.println("After change : "+ob.data);
    }
}