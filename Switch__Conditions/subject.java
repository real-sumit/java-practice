package Switch__Conditions;
import java.io.*;

class subject
{
   public static void main(String[] args)throws IOException 
   {
       InputStreamReader oo=new InputStreamReader(System.in);
       BufferedReader s=new BufferedReader(oo);
       
       System.out.println("ENTER NO OF STUDENTS YOU WANT INPUT MARKS:");    
       int u=Integer.parseInt(s.readLine());
       
       for(int t=1;t<=u;t++)
       {
           System.out.println("ENTER NAME OF STUDENT :");
           String name=s.readLine();
          
           System.out.println("ENTER MARKS OF MATHEMATICS :");    
           int a=Integer.parseInt(s.readLine());
           System.out.println("ENTER MARKS OF COMPUTER :");
           int b=Integer.parseInt(s.readLine());
           System.out.println("ENTER MARKS OF PHYSICS :");
           int c=Integer.parseInt(s.readLine());
           System.out.println("ENTER MARKS OF CHEMISTRY :");
           int d=Integer.parseInt(s.readLine());
           System.out.println("ENTER MARKS OF BIOLOGY :");
           int e=Integer.parseInt(s.readLine());
           System.out.println("ENTER MARKS OF PSYCHOLOGY :");
           int f=Integer.parseInt(s.readLine());
           System.out.println("ENTER MARKS OF ECONOMICS :");
           int g=Integer.parseInt(s.readLine());
           System.out.println("ENTER MARKS OF GEOGRAPHY :");
           int h=Integer.parseInt(s.readLine());
           System.out.println("ENTER MARKS OF LAW :");
           int i=Integer.parseInt(s.readLine());
           System.out.println("ENTER MARKS OF POLITICAL SCIENCE :");
           int j=Integer.parseInt(s.readLine());
           System.out.println("ENTER MARKS OF ANTHROPOLOGY :");
           int k=Integer.parseInt(s.readLine());
           System.out.println("ENTER MARKS OF SOCIOLOGY :");
           int l=Integer.parseInt(s.readLine());
           System.out.println("ENTER MARKS OF PERFORMING ARTS :");
           int m=Integer.parseInt(s.readLine());
           System.out.println("ENTER MARKS OF VISUAL ARTS :");
           int n=Integer.parseInt(s.readLine());
           System.out.println("ENTER MARKS OF HISTORY :");
           int o=Integer.parseInt(s.readLine());
           System.out.println("ENTER MARKS OF LITERATURE & LANGUAGE :");
           int p=Integer.parseInt(s.readLine());
           System.out.println("ENTER MARKS OF PHILOSOPHY :");
           int q=Integer.parseInt(s.readLine());
           System.out.println("ENTER MARKS OF THEOLOGY :");
           int r=Integer.parseInt(s.readLine());
       
           int total=a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r;
           int avg=t/18;
              
           char gr;
           if(avg>90)       
           gr='A';
           else if(avg>80)
           gr='B';
           else if(avg>70)
           gr='C';
           else if(avg>60)
           gr='D';
           else if(avg>50)
           gr='E';
           else
           gr='F';
          
           System.out.println("NAME : "+name);
           System.out.println("Total : "+total);
           System.out.println("Average : "+avg);
           System.out.println("Grade : "+gr);
       }
   }
}