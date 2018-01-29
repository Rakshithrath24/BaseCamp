package Scores;

public class Solution 
{
	 static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) 
	 {
		 int[] res = new int[lowerLimits.length];
		 for(int i=0;i<lowerLimits.length;i++)
		 {
			 int min = lowerLimits[i];
			 int max = upperLimits[i];
			 int count=0;
			 for(int j=0;j<scores.length;j++)
			 {
				 if(scores[j]>=min && scores[j]<=max)
				 {
					 count++;
				 }
			 }
			 res[i]=count;
		 }
		 return res;
	    
	 }


	public static void main(String[] args) 
	{
	
		int[] scores ={2,5,3,7,8};
		int[] lowerLimits ={5,2};
		int[] upperLimits ={8,7};
		
		int[] a=jobOffers(scores,lowerLimits,upperLimits);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		// TODO Auto-generated method stub

	}

}
