package StringProblem;

import java.util.Scanner;

public class Solution 
{
	public static int binarySearch(char[] ch,int low,int high,char key)
	{
		if(low<=high)
		{
			int mid=(low+high)/2;
			if(ch[mid]==key)
			{
				return 1;
			}
			if(key<ch[mid])
			{
				return binarySearch(ch,low,mid-1,key);
			}
			else
			{
				return binarySearch(ch,mid+1,high,key);
			}
		}
		return 0;
		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str="";
		int count=0,count1=0,flag=1;
		while(flag==1)
		{
			System.out.println("Enter the Valid String!:");
			str=sc.nextLine();
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)!=' ')
				{
					count++;
				}
				int a=str.charAt(i)-65;
				if(a>=0 && a<=26)
				{
					count1++;
				}
			}
			if(count<10 || count1<5)
			{
				System.out.println("The Input must have Minimum 10 characters and there must be minimum 5 upper case letters!");
				flag=1;
				count=0;
				count1=0;
			}
			else
			{
				System.out.println("String is Valid!");
				flag=0;
			}
			
		}
		char[] ch=str.toCharArray();
		int k=0;
		char[] ch1= new char[str.length()];
		for(int i=0;i<ch.length;i++)
		{
			int a=ch[i]-65;
			if(a>=0 && a<=26)
			{
				ch1[k]=ch[i];
				k++;
			}
			
		}
		//for(char a:ch1)
			//System.out.println(a);
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<k-i-1;j++)
			{
				if(ch1[j]>ch1[j+1])
				{
					char temp =ch1[j];
					ch1[j]=ch1[j+1];
					ch1[j+1]=temp;
				}
			}
		}
		//for(char a:ch1)
			//System.out.println(a);
		System.out.println("Enter the Key to Search!:");
		char key=sc.next().charAt(0);
		int c=0;
		int flag1 = binarySearch(ch1,0,k-1,key);
		if(flag1==1)
		{
			for(char i:ch1)
			{
				if(i==key)
					c++;
			}
			System.out.println("Key found! Count="+c);
		}
		else
		{
			System.out.println("Key not Found!");
		}
		
	}

}
