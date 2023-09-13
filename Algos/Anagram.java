package Algos;
import java.io.*;
/*Anagrams are those pair of words which have same permutation*/
class Anagram
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader ii=new InputStreamReader (System.in);
        BufferedReader bb=new BufferedReader (ii);

        System.out.println("Enter the anagrams :");
        String st1=bb.readLine();
        String st2=bb.readLine();

        st1=st1.toUpperCase();
        st2=st2.toUpperCase();

        int ar[]=new int[26];
        int k=0;
        char ch;

        if(st1.length()==st2.length())	{
            for(int i=0;i<st1.length();i++)	{
                ch=st1.charAt(i);
                k=(int)ch-65;
                ++ar[k];
            }

            for(int i=0;i<st2.length();i++)	{
                ch=st2.charAt(i);
                k=(int)ch-65;
                --ar[k];
            }
        }

        k=1;
        for(int i=0;i<26;i++)	{
            if(ar[i]==0)
            k=0;
            else	{
                k=1;
                break;
            }
        }

        if(k==0)
        System.out.println("They are Anagrams");
        else
        System.out.println("They are not Anagrams");
    }
}