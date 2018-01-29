package Duplicates;

public class Solution 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	 char[] ch={'a','b','c','a','b'};
	 String s="";
	 int n=ch.length;
	 for(int i=0;i<n;i++)
	 {
		 for(int j=i+1;j<n;j++)
		 {
			 if(ch[i]==ch[j])
			 {
				 int k = j;
				 while(k !=n-1)
				 {
					 ch[k]=ch[k+1];
					 k++;
				 }
				 j--;
				 n--;
			 }
		 }
	 }
	 
	 for(int i=0;i<n;i++)
	 {
		 System.out.println(ch[i]);
	 }
	}


}
