package AmstrongNumber;

public class Solution 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=1634,num1=1634,sum=0;
		String s=""+num;
		int l =s.length();
		while(num!=0)
		{
			
			int n= num%10;
			sum=sum+(int)Math.pow(n,l);
			num=num/10;
		}
		if(num1==sum)
		{
			System.out.println("AmstrongNumber");
		}
		else
			System.out.println("Not Amstrong Number");
	}

}
