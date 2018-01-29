package Anagram;

public class Solution {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="silent";
		String str1="listen";
		char[] ch=str.toCharArray();
		char[] ch1=str1.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch1.length;j++)
			{
				if(ch[i]==ch1[j])
				{
					count++;
					break;
				}
			}
		}
		if(count==ch.length)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not a Anagram");
		}

	}

}
