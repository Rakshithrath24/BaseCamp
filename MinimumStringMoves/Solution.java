package MinimumStringMoves;

public class Solution 
{
	 static int easyStrings(String a, String b) 
	    {
	        char[] a1 = a.toCharArray();
	        char[] b1 = b.toCharArray();
	        int count=0;
	        for(int i=0; i<a1.length;i++)
	        {
	           if(a1[i]!=b1[i])
	           {
	               count++;
	               
	           }
	        }
	        if(count%2==0)
	        	return count/2;
	        	return count/2+1;

	    }


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String a="rakshith";
		String b="raksthih";
		System.out.println(easyStrings(a,b));
		

	}

}
