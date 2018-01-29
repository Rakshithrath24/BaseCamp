package SelectionSort;

public class Solution
{
	public static void SelectionSort(int[] arr )
	{
		
		for(int i=0;i<arr.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
	}

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		int[] arr={2,5,6,3,5,8,3,6};
		SelectionSort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
