package Candies;

public class Solution 
{
	
	static long getCandies(long n, long p) 
    {
       int[] a = new int[(int)n];
        int k=0;
       for(int i=1;i<=n;i++)
       {
           if(n%i==0)
           {
               a[k]=i;
               k++;
           }
       }
        if((int)p>a.length)
        return 0;
        return a[(int)p-1];
    }
	

	public static void main(String[] args) 
	{
		long a =100, b=110;
		long c=getCandies(a,b);
		System.out.println(c);
		// TODO Auto-generated method stub

	}

}
