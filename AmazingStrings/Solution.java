package AmazingStrings;

public class Solution 
{
	static int[] minimalOperations(String[] words) 
	{
		int[] res = new int[words.length];
		for(int i=0;i<words.length;i++)
		{
			int count=0;
			char[] ch = words[i].toCharArray();
			for(int j=0;j<ch.length-1;j++)
			{
				if(ch[j]==ch[j+1])
				{
					count++;
					j++;
				}
			}
			res[i]=count;
		}
		return res;

    }


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String[] str = {"abab","aab","aggga"};
		int[] res=minimalOperations(str);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}

	}

}
