package SumOfTwoElementsInArray;

public class Solution 
{
	static int numberOfPairs(int[] a, long k) 
    {
        int count=0;
        for(int i=0;i<a.length;)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                   if(a[i]+a[j]==k)
                	{
                	   count++;
                	}
                    a[j]=-1;
                }
            }
        }
        for(int i=0;i<a.length;)
        {
            for(int j=i+1;j<a.length;j++)
            {
                   if(a[i]+a[j]==k)
                	{
                	   count++;
                	}
            }
        }

        for(int i=0;i<a.length;i++)
        {
        	System.out.print(a[i]+" ");
        }
        System.out.println();
        return count;
    }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] a ={1,2,46,1,46,3};
		long b=47;
		int c=numberOfPairs(a,b);
		System.out.println(c);
		

	}

}
