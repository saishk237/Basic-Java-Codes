import java.io.*;
import java.util.*;
import java.util.Scanner;

public class SumOfDivisors
{
    public static void main(String args[])
    {
        int t,n;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        if(t>=1 && t<=100)
        {
            int[] sum = new int[t];
            int[] arr = new int[t];
            for(int i=0; i<t; i++)
            {
                sum[i]=0;
                n=sc.nextInt();
                arr[i]=n;
                if(n>=1 && n<=1000000000)
                {
                    for(int j=1; j<n; j++)
                    {
                        if(n%j==0)
                            sum[i]=sum[i]+j;
                    }
                }
                else
                    System.out.println("Invalid Input");
            }
            for(int k=0; k<t; k++)
            {
                if(arr[k]==sum[k])
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
        else
            System.out.println("Invalid Input");
    }
}


/*
OUTPUT:
3
6
5
28
YES
NO
YES
*/
