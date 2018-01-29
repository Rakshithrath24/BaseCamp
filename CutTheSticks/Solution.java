package CutTheSticks;

public class Solution 
{
	static int[] cutSticks(int[] lengths)
	{
		int[] arr = new int[lengths.length];
		for(int i=0;i<lengths.length-1;i++)
		{
			int flag=0;
			for(int j=0;j<lengths.length-i-1;j++)
			{
				if(lengths[j]>lengths[j+1])
				{
					int temp=lengths[j];
					lengths[j]=lengths[j+1];
					lengths[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
		int k=0;
		for(int i=0;i<lengths.length;)
		{
			int count=0;
			if(lengths[i]!=0)
			{
				for(int j=i;j<lengths.length;j++)
                {
						lengths[j]=lengths[j]-lengths[i];
						count++;
                }
				if(count!=0)
				{
					arr[k++]=count;
				}
                i++;
			}
			else
				i++;
		}
		int[] arr1=new int[k];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=arr[i];
		}
		return arr1;
	}

	public static void main(String[] args) 
	{
		
		int[] a={1,9,2,6,4,5,8,7,3};
		int[] b=cutSticks(a);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		
		// TODO Auto-generated method stub

	}

}
