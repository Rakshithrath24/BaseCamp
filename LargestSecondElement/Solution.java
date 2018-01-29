package LargestSecondElement;

public class Solution 
{
	public static void main(String[] args)
	{
		int[] arr ={2,2,4,5,6,79,6,5};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;i++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp; 
				}
			}
		}
		System.out.println(arr[arr.length-2]);
	}

}
