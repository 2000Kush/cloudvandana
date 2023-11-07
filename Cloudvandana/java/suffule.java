import java.util.*;
class suffle
{
	public static void main(String[] args) 
	{
		int [] a={1,2,3,4,5,6};
		int [] b=new int[a.length-1];
		int i=0;
		int j=(a.length/2);
		for(int x=0;x<3;x++)
		{
			System.out.println(a[x]);
			System.out.println(a[j]);
			j++;
		}
		//System.out.println(j);
		//System.out.println(i);
		
	}
}