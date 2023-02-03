import java.util.*;
class rel
{
	public static void main(String opr[])
	{
		Scanner obj = new Scanner(System.in);//Scanner class for reading inputs
		int a,b;//declaration of variables in int values
		System.out.println("Enter first value: ");
		a=obj.nextInt();
		System.out.println("Enter second value: ");
		b=obj.nextInt();
		System.out.println("Greater than "+(a>b));
		System.out.println("Greater than Equal to "+(a>=b));
		System.out.println("Greater than"+(a<b));
		System.out.println("Greater than Equal to "+(a<=b));
		System.out.println("Equal to "+(a==b));
		System.out.println("Not Equal to "+(a!=b));
	}
}
		