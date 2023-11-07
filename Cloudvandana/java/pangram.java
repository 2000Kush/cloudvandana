import java.util.*;
class pangram
{
	public static void main(String[] args) 
	{
		
		String m="THIS quick OWN FOX JUMPS OVER THE LAZY DOG";
		m=m.replace(" ","");
		m=m.toUpperCase();
		System.out.println(m);
		char y[]=m.toCharArray();
		int size=y.length;
		int a[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int i=0;
		while(i!=size)
		{
			int index =y[i]-65;
			a[index]=1;
			++i;
		}
		
		int p=0;
		while(p!=26)
		{
			if(a[p]==1)
				++p;
			else 
			{
				System.out.println("This is non Pangram sentence");
				System.exit(0);
			}
		}
		System.out.println("This is a Pangram sentence");
		
		
	}
}