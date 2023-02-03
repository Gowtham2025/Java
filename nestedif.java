import java.util.*;
class num
{
	public static void main(String[] args)
	{
	Scanner obj=new Scanner(System.in);
	int a,b;
	System.out.println("Enter the Age: ");
	a =obj.nextInt();
	System.out.println("Enter the Weight: ");
	b =obj.nextInt();
	if (a>21)
	{
		if (b>50)
		{
			System.out.println("Eligible for Blood Donation");
		}
		else
		{
			System.out.println("Not Eligible for Blood Donation");
		}
	}
	else
	{
		System.out.println("Not Eligible because under 18");
	}
	
	}
}

