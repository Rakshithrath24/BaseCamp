package QuickSort;

public class Solution 
{
	public static void Quicksort(int[] arr,int low ,int high)
	{
		if(low<high)
		{
			int mid = partition(arr,low,high);
			Quicksort(arr,low,mid);
			Quicksort(arr,mid+1,high);
		}
	}
	public static int partition(int[] arr,int low,int high)
	{
		int pivot=arr[low];
		int i=low;
		int j=high;
		while(true)
		{
			while(arr[i]<pivot && arr[i]!=pivot)
			{
				i++;
			}
			while(arr[j]>pivot && arr[j]!=pivot)
			{
				j--;
			}
			if(i<j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			else
			{
				return j;
			}
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr={4,6,3,2,7,1,8,5,9};
		Quicksort(arr,0,arr.length-1);
		// TODO Auto-generated method stub
		for(int p=0;p<arr.length;p++)
		{
			System.out.println(arr[p]);
		}

	}

}
