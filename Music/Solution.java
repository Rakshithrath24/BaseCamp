package Music;

public class Solution 
{
	static int numOfPlaylist(int N, int K, int L) 
	{
		int count=1;
		for(int i=N-1,j=0;j<K;j++)
		{
			count=count*i;
		}
		return count*L;
    }
	public static void main(String[] args)
	{
		System.out.println(numOfPlaylist(10,2,3));
	}
}
