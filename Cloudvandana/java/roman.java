import java.util.*;
class roman
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the roman number ");
		String a=sc.next();
		int sum=0;
		int b=0;
		int y=0;
		for (int i=a.length()-1;i>=0;i--)
		{
			switch(a.charAt(i))
			{
			case 'I': b=1;break;
			case 'V': b=5;break;
			case 'X': b=10;break;
			case 'L': b=50;break;
			case 'C': b=100;break;
			case 'D': b=500;break;
			case 'M': b=1000;break;
			}
			if(b<y)
			{
				sum-=b;
				y=b;
			}
			else
			{
				sum+=b;
				y=b;
			}
		}
		System.out.println("Integer Number is"+ sum);
	}
}
