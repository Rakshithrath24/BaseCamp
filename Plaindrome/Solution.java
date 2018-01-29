package Plaindrome;

public class Solution 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="Rakshith";
		int flag=0;
		for(int i=0,j=str.length()-1;i<j;i++,j--)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("NotPalindrome");
		}

	}

}
