package Tickets;

public class Solution 
{
	static long waitingTime(int[] tickets, int p) 
    {
        long wt=0;
        /*while(tickets[p]!=0)
        {   
            for(int i=0;i<tickets.length;i++)
            {
                if(tickets[p]==0)
                {
                    break;
                }
                if(tickets[i]>0)
                {
                    wt++;
                    tickets[i]=tickets[i]-1;
                }
            }
        }*/
        for(int i=0;i<tickets.length;i++)
        {
        	if(tickets[i]>=tickets[p] && i<=p)
        	{
        		wt=wt+tickets[p];
        	}
        	else if(tickets[i]<tickets[p] && i<p)
        	{
        		wt=wt+tickets[i];
        	}
        	else if(tickets[i]<tickets[p] && i>p)
        	{
        		wt=wt+tickets[i];
        	}
        	else if(tickets[i]>=tickets[p] && i>p)
        	{
        		wt=wt+tickets[p]-1;
        	}
        }
        return wt;
        

    }


	public static void main(String[] args) 
	{
		int[] tickets={2,4,5,1,6,2};
		int p=1;
		long a= waitingTime(tickets,p);
		System.out.println(a);
		
		// TODO Auto-generated method stub
	}

}
