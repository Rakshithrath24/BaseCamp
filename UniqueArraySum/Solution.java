package UniqueArraySum;

public class Solution 
{

	 static int getMinimumUniqueSum(int[] arr) 
	    {
	        for(int i=0;i<arr.length;i++)
	        {
	            for(int j=i+1;j<arr.length;j++)
	            {
	            	if(arr[i]>arr[j])
	            	{
	            		int temp=arr[i];
	            		arr[i]=arr[j];
	            		arr[j]=temp;
	            	}
	            }
	            
	        }
	        int sum =0;
	        for(int i=0;i<arr.length;i++)
	        {
	        	for(int j=i+1;j<arr.length;j++)
	        	{
	        		if(arr[i]==arr[j])
	        		{
	        			arr[j]=arr[i]+1;
	        		}
	        	}
	        }
	        for(int i=0;i<arr.length;i++)
	        {
	        	sum=sum+arr[i];
	        }
	        
	       return sum;
	    }
	public static void main(String[] args) 
	{
		int[] arr ={10,3,3,3,6,4};
		System.out.println(getMinimumUniqueSum(arr));
		
		
		// TODO Auto-generated method stub
	}

}
