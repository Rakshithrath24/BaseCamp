package IsPangram;

public class Solution 
{
	static String isPangram(String[] strings) 
    {
		char[] ch ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String s="";
		for(int i=0;i<strings.length;i++)
		{
			int count=0;
			char[] ch1 = strings[i].toCharArray();
			for(int j=0;j<ch.length;j++)
			{
				for(int k=0;k<ch1.length;k++)
				{
					if(ch[j]==ch1[k])
					{
						count++;
						break;
					}
				}
			}
			if(count==26)
			{
				s=s+1;
			}
			else
			{
				s=s+0;
			}
		}
		return s;
    }

	public static void main(String[] args) 
	{
		String[] s={"the quick brown fox jump over the lazy dog"};
		String str=isPangram(s);
		System.out.println(str);
	}

}
