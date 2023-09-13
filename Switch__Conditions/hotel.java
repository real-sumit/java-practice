package Switch__Conditions;
import java.io.*;

class hotel
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader ii= new InputStreamReader(System.in);
        BufferedReader bb= new BufferedReader(ii);
            
        System.out.println("*****$$$$$$*****THE DEFENCE ACADEMY HOTEL*****$$$$$$*****");
        
        System.out.println("ENTER THE FLOOR");
        int F=Integer.parseInt(bb.readLine());
         
        System.out.println("ENTER THE ROOM NO.");
        int R=Integer.parseInt(bb.readLine());
         
        switch(F)
        {
            case 1:
            switch(R)
            {    
                case 1:
                System.out.println("Rs 800 "+"JUNIORS");
                break;
                               
                case 2:
                System.out.println("Rs 1000 "+"SENIORS");
                break;
 
                case 3:
                System.out.println("Rs 1200 ");
                break;
              
                case 4:
                System.out.println("Rs 1500 ");
                break;
                           
                case 5:
                System.out.println("Rs 1800 ");
                break;
                                
                default:
                System.out.println("NO MORE ROOMS, PLEASE");
            }
                
            case 2:
            switch(R)
            {
                case 1:
                System.out.println("Rs 1200 "+"JUNIORS");
                break;
                 
                case 2:
                System.out.println("Rs 1500 "+"SENIORS");
                break;
                     
                case 3:
                System.out.println("Rs 1700 ");
                break;
                                
                case 4:
                System.out.println("Rs 2000 ");
                break;                 
                
                case 5:
                System.out.println("Rs 2200 ");
                break;                   
              
                default:
                System.out.println("NO MORE ROOMS, PLEASE");
            }
           
            case 3:
            switch(R)
            {
               case 1:
               System.out.println("Rs 1600 "+"JUNIORS");
               break;                   
               
               case 2:
               System.out.println("Rs 2000 "+"SENIORS");
               break;                   
              
               case 3:
               System.out.println("Rs 2250 ");
               break;                   
              
               case 4:
               System.out.println("Rs 2600 ");
               break; 
                
               case 5:
               System.out.println("Rs 2850 ");
               break; 
               
               default:
               System.out.println("NO MORE ROOMS, PLEASE");
            }
                
            case 4:
            switch(R)
            {
               case 1:
               System.out.println("Rs 2000 "+"JUNIORS");
               break;                   
             
               case 2:
               System.out.println("Rs 2500 "+"SENIORS");
               break;                   
             
               case 3:
               System.out.println("Rs 2700 ");
               break;                   
            
               case 4:
               System.out.println("Rs 3000 ");
               break; 
            
               case 5:
               System.out.println("Rs 3400 ");
               break; 
              
               default:
               System.out.println("NO MORE ROOMS, PLEASE");
            }
           
            case 5:
            switch(R)
            {
               case 1:
               System.out.println("Rs 2400 "+"JUNIORS");
               break;                   
            
               case 2:
               System.out.println("Rs 3000 "+"SENIORS");
               break;                   
               
               case 3:
               System.out.println("Rs 3350 ");
               break;                   
             
               case 4:
               System.out.println("Rs 3600 ");
               break;
                
               case 5:
               System.out.println("Rs 4000 ");
               break;
                 
               default:
               System.out.println("NO MORE ROOMS, PLEASE");
            }
                      
            default:
            System.out.println("NO MORE FLOORS, PLEASE");
        }
    }
}