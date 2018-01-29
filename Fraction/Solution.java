package Fraction;

public class Solution 
{
	static String[] reducedFractionSums(String[] expressions) 
    {
        String[] res = new String[expressions.length];
        for(int i=0;i<expressions.length;i++)
        { 
            String[] str = expressions[i].split("\\+");
            String[] str1 = str[0].split("/");
            String[] str2 = str[1].split("/");
            int n1 = Integer.parseInt(str1[0]);
            int d1 = Integer.parseInt(str1[1]);
            int n2 = Integer.parseInt(str2[0]);
            int d2 = Integer.parseInt(str2[1]);
            int lcm = (d1>d2)? d1:d2;
            while(true)
            {
                if(lcm%d1==0 && lcm%d2==0)
                {
                    break;
                }
                lcm++;
            }
            int num = (n1*(lcm/d1)) + (n2*(lcm/d2));
            int gcd=0;
            for(int j=1;j<=num && j<=lcm;j++)
            {
                if(num%j==0 && lcm%j==0)
                     gcd=j;
            }
            int n = num/gcd;
            int d = lcm/gcd;
            String s="";
            res[i] =s+n+"/"+d;
        }
        return res;

    }

	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			String[] s ={"1/2+1/6"};
			String[] s1=reducedFractionSums(s);
			System.out.println(s1[0]);
	}

}
