package Sorting;

public class Solution 
{
	/*public static String sortChar(String str)
	{
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp =ch[i];
					ch[i]=ch[j];
					ch[j] =temp;
				}
			}
		}
		String str1="";
		for(int i=0;i<ch.length;i++)
		{
			str1=str1+ch[i];
		}
		return str1;	
	}*/
	public static String sortLine(String str1)
	{
 		char[] ch = str1.toCharArray();
		String s2="";
		int k=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ' && i!=ch.length-1)
			{
				
			}
			else
			{
				for(k=k+0;k<i && k<ch.length;k++)
				{
					for(int j=k+1;j<i && j<ch.length;j++)
					{
						if(ch[k]>ch[j])
						{
							char temp=ch[k];
								 ch[k]=ch[j];
								 ch[j]=temp;
						}
					}
				}
				k=k+1;
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			s2=s2+ch[i];
		}
		return s2;
	}
	
	

	public static void main(String[] args) 
	{
		String str ="this program is really breaking my head.";
		str = sortLine(str);
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i));
		}

	}

}
