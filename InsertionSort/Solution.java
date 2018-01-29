package InsertionSort;

public class Solution 
{
	public static void InsertionSort(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int key=arr[i];
			int pos=i;
			while(pos>0 && arr[pos-1]>key)
			{
				arr[pos]=arr[pos-1];
				pos=pos-1;
			}
			arr[pos]=key;
		}
	}

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		int[] arr={4,6,3,2,7,1,8,5,9};
		InsertionSort(arr);
		for(int p=0;p<arr.length;p++)
		{
			System.out.println(arr[p]);
		}


	}

}
