import java.util.*;
class array
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		
		int a[]=new int[10];
		int i,max;
		max=a[0];
		System.out.println("Enetr the Array Elements:");
		for(i=1;i<5;i++)
		{
			a[i]=obj.nextInt();
		
		}
		for (i=0;i<5;i++)
		{
			if (a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Biggest number in Array: "+max);
	}
}