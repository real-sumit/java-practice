package Patt;
import java.io.*;
class smith
{
	public static void main(String args[])throws IOException
	{
		int i,j,k,x;
		for(i=0;i<5;i++)
		{
			x=i+1;
			for(j=0;j<=i;j++)
			{
				System.out.print(x+" ");
				if(x==8)
					x--;
				else
					x++;
			}
			x=x-2;
			for(k=0;k<i;k++)
			{
				System.out.print(x+" ");
				x--;
			}
			System.out.println();
		}
	}
} 