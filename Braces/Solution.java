package Braces;

public class Solution
{
	static char[] ch = new char[10];
	static int top = -1;
	static String[] braces(String[] values)
	{
		String[] str = new String[values.length];
        for(int i=0;i<values.length;i++)
        {
        	int count=0;
            for(int j=0;j<values[i].length();j++)
            {
            	char cur = values[i].charAt(j);
                if(cur=='(' && cur !=')' || cur=='{' && cur!='}' || cur=='[' && cur!=']')
                {
                    top++;
                    ch[top]=cur;
                }
                else if(cur==')' || cur=='}' || cur==']' )
                {
                	if(top==-1)
                	{
                		str[i]="NO";
                		break;
                	}
                	else if(ch[top]=='(' && cur==')' || ch[top]=='{' && cur=='}' || ch[top]=='[' && cur==']')
                	{
                		top--;
                	}
                	else
                	{
                		str[i]="NO";
                		break;
                	}
                	
                }
                count++;
            }
            if(count==values[i].length())
            {
            	str[i]="YES";
            }
        }
        return str;
   }

	public static void main(String[] args) 
	{
		String[] str = {"(){}[]",")({}[]"};
		
				str=braces(str);
				for(String i:str)
				{
					System.out.println(i);
				}
		// TODO Auto-generated method stub

	}

}
