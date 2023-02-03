import java.util.*;
class array
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		
		int a[]=new int[10];
		int i,min;
		System.out.println("Enter the Array Elements:");
		for(i=1;i<5;i++)
		{
			a[i]=obj.nextInt();
		
		}
		min=a[0];
		for (i=0;i<5;i++)
		{
			if (a[i]<min)
			{
				min=a[i];
				System.out.println("Smallest number in Array: "+min);
			}
			
		}
		//System.out.println("Biggest number in Array: "+max);
	}
}