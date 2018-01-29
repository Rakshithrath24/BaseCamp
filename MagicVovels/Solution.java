package MagicVovels;

public class Solution 
{
	static int longestSubsequence(String s) 
    {
        int count = 0;
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='a'&& (ch[i+1]=='a'|| ch[i+1]=='e'))
            {
                count++;
            }
            else
            {
                return 0;
            }
        }
        return count;
    }

	public static void main(String[] args) 
	{
		int n =longestSubsequence("aaaeeeeiiiooouu");
		System.out.println(n);
		// TODO Auto-generated method stub

	}

}
