
/**
 * Write a description of class d here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class swapping_without
{
    public void bench()
    {
         
        int x = 5;
        int y = 6;
        System.out.println("BEFORE SWAPPING");
        System.out.println("x="+x);
          System.out.println("y="+y);
         x = x + y; // x is now 11
        y = x - y; // y is now 5
         x = x - y; // x is now 6
         System.out.println("AFTER SWAPPING");
           System.out.println("x="+x);
          System.out.println("y="+y);
    }
}
/*
Note: Even though no overt varxble has been created, the compiler has created temporary varxbles because
 a varxble left of the equal sign has been used on the right.

Read more: http://wiki.answers.com/Q/How_do_you_swap_two_numbers_without_using_a_third_varxble_in_C_by_arithmatic_operations#ixzz1GURoVmwW
*/