package Theory;
class condition_test
{
   public static void if_elseif_else (String args [])
   {
       int a=1;
       if (a==1)
       System.out.println("if worked");
       else if(a==1)
       System.out.println("elseif worked");
       else
       System.out.println("else worked");
    }
   public static void if__if_elseif_else (String args []) 
   {
       int b=2;
       if(b==2)
       {
           if(b==2)
           System.out.println("if_if worked");
           else if(b==2)
           System.out.println("if_elseif worked");
           else
           System.out.println("if_else worked");
        }
    }
   public static void if_else__if_elseif_else(String args [])
   {
       int c=3;
       if(c==4)
       System.out.println("not worked");
       else
       {
           if(c==3)
           System.out.println("else-if worked");
           else if(c==3)
           System.out.println("else-elseif worked");
           else
           System.out.println("else-else worked");
        }
    }
   public static void if_elseif__if_elseif_else__else(String args []) 
   {
       int d=4;
       if(d==5)
       System.out.println("not worked");
       else if(d==4)
       {
           if(d==4)
           System.out.println("elseif-if worked");
           else if(d==4)
           System.out.println("elseif-elseif worked");
           else
           System.out.println("elseif-else worked");
        }
       else
       System.out.println("not worked");
    }
}