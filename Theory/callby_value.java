package Theory;

class callby_value
{
    int data=2;
    void change(int data)
    {
        this.data=this.data*data;
    }
    public static void main(String args[])
    {
        callby_value ob=new callby_value();
        System.out.println("Before change : "+ob.data);
        ob.change(2);
        System.out.println("After change : "+ob.data);
    }
}