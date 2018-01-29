package FibPattern;

import java.util.Scanner;

public class Solution 
{
	public static int fib(int n)
	{
		int a = 0, b = 1, c;
		if (n == 0)
			return a;
		for (int i = 2; i <= n; i++)
		{
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}   
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int p=(n*(n+1))/2;
		int[] arr = new int[p];
		for(int i=0;i<p;i++)
		{
			arr[i]= fib(i);
			
		}
		int k=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(arr[k]+" ");
				k++;
			}
			System.out.println();
		}
	    
	}

}
