package Theory;

class WithoutBreakTest
{
   public static void main()
   {
      int integer=1;
      switch(integer)
      {
         case 1: case '3': case '5': case '7':
         System.out.println("Hi");
         case 2: case '4': case '6': case '8':
         System.out.println("Hello");
         default:
         System.out.println("Bye");
       }
    }
}