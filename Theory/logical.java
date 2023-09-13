package Theory;
class logical
{
    public static void main()
    {
        boolean x=false,y=true;
        System.out.println("x = "+x+"\t"+"y = "+y);
        System.out.println();
        
        System.out.println("false && false = "+(x&&x));
        System.out.println("false && true = "+(x&&y));
        System.out.println("true && false = "+(y&&x));
        System.out.println("true && true = "+(y&&y));
        System.out.println("false || false = "+(x||x));
        System.out.println("false || true = "+(x||y));
        System.out.println("true || false = "+(y||x));
        System.out.println("true || true = "+(y||y));
        System.out.println("! false = "+(!x));
        System.out.println("! true = "+(!y));
        System.out.println("!(false && false) = "+(!(x&&x)));
        System.out.println("!(false && true) = "+(!(x&&y)));
        System.out.println("!(true && false) = "+(!(y&&x)));
        System.out.println("!(true && true) = "+(!(y&&y)));
        System.out.println("!(false || false) = "+(!(x||x)));
        System.out.println("!(false || true) = "+(!(x||y)));
        System.out.println("!(true || false) = "+(!(y||x)));
        System.out.println("!(true || true) = "+(!(y||y)));
    }
}
