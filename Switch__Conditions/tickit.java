package Switch__Conditions;
import java.io.*;

class tickit
{
    public static void main(String[] args)throws IOException
    {
         InputStreamReader ii=new InputStreamReader(System.in);
         BufferedReader bb = new BufferedReader(ii);
               
         System.out.println("Enter the TIER:") ;      
         char a=(char)(bb.read());
                         
         System.out.println("Enter the BLOCK:");
         char b=(char)(bb.read());
             
         System.out.println("Enter the no. of tickits:");
         int c=Integer.parseInt(bb.readLine());
              
         switch(a)
         {
                case 'L':
                switch(b)
                {
                     case'A':
                     System.out.println("TOTAL COST IS :  RS"+(150*c));
                     break;
                     
                     case'B':
                     System.out.println("TOTAL COST IS :  RS"+(350*c));
                     break;
                     
                     case'C':
                     System.out.println("TOTAL COST IS :  RS"+(1000*c));
                     break;
                     
                     case'D':
                     System.out.println("TOTAL COST IS :  RS"+(750*c));
                     break;
                     
                     default:                    
                     System.out.println("No other block");
                }
                break;
                                
                case'M':
                switch(b)
                {
                      
                     case'A':
                     System.out.println("TOTAL COST IS :  RS"+(250*c));
                     break;
                     
                     case'B':
                     System.out.println("TOTAL COST IS :  RS"+(450*c));
                     break;
                     
                     case'C':
                     System.out.println("TOTAL COST IS :  RS"+(1200*c));
                     break;
                     
                     case'D':
                     System.out.println("TOTAL COST IS :  RS"+(900*c));
                     break;
                     
                     default:
                     System.out.println("No other block");
                }
                break;
                
                case'U':
                switch(b)
                {
                        
                     case'A':
                     System.out.println("TOTAL COST IS :  RS"+(100*c));
                     break;
                     
                     case'B':
                     System.out.println("TOTAL COST IS :  RS"+(250*c));
                     break; 
                     
                     case'C':
                     System.out.println("TOTAL COST IS :  RS"+(800*c));       
                     break;
                     
                     case'D':
                     System.out.println("TOTAL COST IS :  RS"+(600*c));
                     break;
                     
                     default:
                     System.out.println("No other block");
                   
                }
                break;
                
                default:
                System.out.println("No other tier");
            }
      }
 }