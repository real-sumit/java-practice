package Patt;

import java.util.Scanner;
public class x_pattern
{ 
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
 
System.out.println("enter the String:");
String s=ob.nextLine();

int l=s.length();
//System.out.println(l);

char ar[][]=new char[l][l];
int i,j;

        for( i=0;i<l;i++)
          {
            for(j=0;j<l;j++)
              {
                  if((i-j)==0)
                  {
                 ar[i][j]=s.charAt(i);
               }
               if((i+j)==(l-1))
               {
                   ar[i][j]=s.charAt(i);
                }
               
          }
        }

                   

             for(i=0;i<l;i++)
             {
                 for(j=0;j<l;j++)
                 {
                    System.out.print( ar[i][j]+" ");
                }
                System.out.println(" ");
            }
        }
    }