package CuttingMetalSurplus;

public class Solution 
{
	 static int maxProfit(int costPerCut, int salePrice, int[] lengths) 
	 {
		 int max = lengths[0];
		 for(int i=1;i<lengths.length;i++)
		 {
			 if(lengths[i]>max)
				 max=lengths[i];
		 }
		 int profit=0;
	     for(int i=1;i<max;i++)
	     {
	    	int metal=0,profit1=0;
	    	 for(int j=0;j<lengths.length;j++)
	    	{
	    		 if(lengths[j]>=i)
	    		 {
	    			 metal=lengths[j]/i;
	    			 if(lengths[j]%metal==0)
	    			 {
	    				 profit1=profit1+metal*salePrice-(metal-1)*costPerCut;
	    			 }
	    			 else
	    			 {
	    				 profit1=profit1+metal*salePrice-(metal)*costPerCut;
	    			 }
	    			 if(profit1>profit)
	    				 profit=profit1;
	    		 }
	    	}
	     }
	     return profit;
	 }


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] lengths={26,103,59};
		System.out.println(maxProfit(1,10,lengths));
	}

}
