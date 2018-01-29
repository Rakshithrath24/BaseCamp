package MaxList;
import java.util.*;
public class Solution 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        int m = sc.nextInt();
        for(int i=0;i<m;i++)
        {
        	int l = sc.nextInt();
        	int u = sc.nextInt();
        	int k = sc.nextInt();
        	for(int j=l-1;j<=u-1;j++)
        	{
        		arr[j]=arr[j]+k;
        	}
        }
        long max= arr[0];
        for(int i=1;i<arr.length;i++)
        {
        	if(arr[i]>max)
        		max=arr[i];
        }
        System.out.println(max);
    }
}