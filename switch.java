import java.util.*;
class demoswitch
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int ch;
		System.out.println("Enter a number 1-5: ");
		ch=obj.nextInt();
		
		switch (ch)
		{
			case 1:
				System.out.println("Sun Tv");
				break;
			case 2:
				System.out.println("Vijay Tv");
				break;
			case 3:
				System.out.println("Star Tv");
				break;
			case 4:
				System.out.println("HBO Tv");
				break;
			case 5:
				System.out.println("K Tv");
				break;
			default:
				System.out.println("Please Select bewteen 1-5");
				break;
		}
	}
}