class proposition_logic
{
    public static void main(String[] args)
    {
        int i=0;
        System.out.println();
        
        System.out.print("X"+"\t");
        for(i=0;i<=3;i++)
        { 
            if(i<2)
            System.out.print("0");
            else
            System.out.print("1");
        }
        System.out.println();
                
        System.out.print("Y"+"\t");
        for(i=0;i<=3;i++)
        { 
            if(i%2==0)
            System.out.print("0");
            else
            System.out.print("1");
        }
        System.out.println();
                
        System.out.print("~X"+"\t");
        for(i=0;i<=3;i++)
        { 
            if(i<2)
            System.out.print("1");
            else
            System.out.print("0");
        }
        System.out.println();
                
        System.out.print("~Y"+"\t");
        for(i=0;i<=3;i++)
        { 
            if (i%2!=0)
            System.out.print("0");
            else
            System.out.print("1");
        }
        System.out.println();
                
        System.out.print("X.Y"+"\t");
        for(i=0;i<=3;i++)
        { 
            if (i<=2)
            System.out.print("0");
            else
            System.out.print("1");
        }
        System.out.println();
                
        System.out.print("X+Y"+"\t");
        for(i=0;i<=3;i++)
        { 
            if (i<=2)
            System.out.print("1");
            else
            System.out.print("0");
        }
        System.out.println();
                
        System.out.print("X=>Y"+"\t");
        for(i=0;i<=3;i++)
        { 
            if (i==2)
            System.out.print("0");
            else
            System.out.print("1");
        }
        System.out.println();
                
        System.out.print("X<=>Y"+"\t");   
        for(i=0;i<=3;i++)
        { 
            if (i%3==0)
            System.out.print("1");
            else
            System.out.print("0");
        }
    }
}