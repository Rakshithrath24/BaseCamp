package JumpingJacks;

public class Solution 
{
	static int maxStep(int n, int k) 
    {
        int count =0,count1=0;
        for(int i=1;i<=n;i++)
        {
            if(count+i!=k )
            {
               count = count+i;
              
            }
            
        }
        for(int i=2;i<=n;i++)
        {
        	if(count1+i!=k)
        	{
        		count1 = count1+i;
        	}
        }
        
        return (count>count1)?count:count1;

    }

	public static void main(String[] args) 
	{
			System.out.println(maxStep(3,3));
		// TODO Auto-generated method stub

	}

}
