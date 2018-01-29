package SuperStack;

public class Solution 
{
	static int[] arr = new int[200000];
	static int top = -1;
	static void push(int a)
	{
		top++;
		arr[top]=a;
		System.out.println(a);
	}
	static void pop()
	{
		if(top==0)
		{
			System.out.println("EMPTY");
			top--;
		}
		else
		{
			top--;
			System.out.println(arr[top]);
		}
	}
	static void inc(int e,int k)
	{
		if(top!=-1)
		{
			for(int i=0;i<e;i++)
			{
				arr[i]=arr[i]+k;
			}
			System.out.println(arr[top]);
		}
		else
		{
			System.out.println("EMPTY");
		}
	}
    static void superStack(String[] operations) 
    {
        for(int i=0;i<operations.length;i++)
        {
            String[] ch = operations[i].split(" ");
            if(ch[0].equals("push"))
            {
                int n = Integer.parseInt(ch[1]);
                push(n);
            }
            else if(ch[0].equals("pop"))
            {
                pop();
            }
            else if(ch[0].equals("inc"))
            {
                int e = Integer.parseInt(ch[1]);
                int k = Integer.parseInt(ch[2]);
                inc(e,k);
             }
          
        }

    }


	public static void main(String[] args) 
	{
		String[] str = {"push 4","pop","push 3","push 5","inc 3 1","pop","push 1","inc 2 2","push 4","pop","pop"};
		superStack(str);
		// TODO Auto-generated method stub

	}

}
