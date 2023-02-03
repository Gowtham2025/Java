import java.util.*;
class array
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		
		int a1[]=new int[10];
		int i,s;
		s=0;
		System.out.println("Enetr the Array Elements:");
		for(i=1;i<5;i++)
		{
			a1[i]=obj.nextInt();
			s=s+a1[i];
		}
		System.out.println("Sum of Array: "+s);
	}
}