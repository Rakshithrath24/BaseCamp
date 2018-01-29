package CustomSort;

public class Solution 
{
	static void customSort(int[] arr) 
	 {
	      int max=0;
	      for(int i=0;i<arr.length;i++)
	      {
	    	  if(arr[i]>max)
	    		  max=arr[i];
	      }
	      int[] freqArr = new int[max];
	      for(int i=0;i<arr.length;i++)
	      {
	    	  freqArr[arr[i]-1]++;
	    	  
	      }
	      int maxfreq=0;
	      for(int i=0;i<freqArr.length;i++)
	      {
	    	  if(freqArr[i]>maxfreq)
	    		  maxfreq=freqArr[i];
	      }
	      int k=1;
	      while(k<=maxfreq)
	      {
	    	  for(int i=0;i<freqArr.length;i++)
	    	  {
	    		  if(freqArr[i]==k)
	    		  {
	    			  while(freqArr[i]!=0)
	    			  {
	    				  System.out.println(i+1);
	    				  freqArr[i]--;
	    			  }
	    		  }
	    	  }
	    	  k++;
	      }
	      
	 }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr={2,4,5,5,3,5,6,2,4,2,2,5,7,7,2};
		customSort(arr);

	}

}
