import java.util.*;
class asssort
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int a[]=new int [20];
		int i,j,size,temp;
		System.out.println("Enter the size of an Array: ");
		size=obj.nextInt();
		System.out.println("Enter the Element into an Array: ");
		for (i=0;i<size;i++)
		{
			a[i]=obj.nextInt();
		}
//sorting
		for (i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if (a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Element Array");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
}