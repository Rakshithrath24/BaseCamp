package Compliment;

public class Solution 
{
	   static void getIntegerComplement(int n) 
	    {
	        String str = Integer.toBinaryString(n);
	        char[] str1 = str.toCharArray();
	        for(int i=0;i<str1.length;i++)
	        {
	        	if(str1[i]=='0')
	        	{
	        		str1[i]='1';
	        	}
	        	else
	        	{
		        	str1[i]='0';
	        	}
	        	
	        }
	        int sum=0,count=0;
	        for(int j=str1.length-1;j>0;j--)
	        {
	        	sum = sum + (str1[j]-48) * (int)Math.pow(2,count++);
	        	
	        }
	        System.out.println(sum);

	    }

	public static void main(String[] args) 
	{
		
		getIntegerComplement(50);
		// TODO Auto-generated method stub

	}

}
