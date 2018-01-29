package MergeSort;

public class Solution 
{
	public static void mergesort(int[] arr,int low,int high)
	{
		if(low<high)
		{
			int mid = (low+high)/2;
			mergesort(arr,low,mid);
			mergesort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}
	public static void merge(int[] arr,int low,int mid,int high)
	{
		int[] arr1 = new int[arr.length];
		int i=low;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=high)
		{
			if(arr[i]<arr[j])
			{
				arr1[k]=arr[i];
				k++;
				i++;
			}
			else
			{
				arr1[k]=arr[j];
				k++;
				j++;
			}
		}
		while(i<=mid)
		{
			arr1[k]=arr[i];
			k++;
			i++;
		}
		while(j<=high)
		{
			arr1[k]=arr[j];
			k++;
			j++;
		}
		for(int p=high;p>=low;p--)
		{
			arr[p]=arr1[--k];
		}
		
		
	}

	public static void main(String[] args) 
	{
		int[] arr={4,6,3,2,7,1,8,5,9};
		for(int p=0;p<arr.length;p++)
		{
			System.out.println(arr[p]);
		}
		mergesort(arr,0,arr.length-1);
		// TODO Auto-generated method stub
		for(int p=0;p<arr.length;p++)
		{
			System.out.println(arr[p]);
		}

	}

}
