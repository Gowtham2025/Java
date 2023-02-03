import java.util.*;
class rel
{
	public static void main(String opr[])
	{
		Scanner obj = new Scanner(System.in);//Scanner class for reading inputs
		int a,b,c;//declaration of variables in int values
		System.out.println("Enter first value: ");
		a=obj.nextInt();
		System.out.println("Enter second value: ");
		b=obj.nextInt();
		System.out.println("Enter third value: ");
		c=obj.nextInt();
		boolean la=((a>b)&&(a>c));
		boolean lr=((a>b)||(a>c));
		boolean ln=!(a>c);
		System.out.println("Logical AND: "+la);
		System.out.println("Logical OR: "+lr);
		System.out.println("Logical NOT: "+ln);

		/*System.out.println("Greater than "+(a>b));
		System.out.println("Greater than Equal to "+(a>=b));
		System.out.println("Greater than"+(a<b));
		System.out.println("Greater than Equal to "+(a<=b));
		System.out.println("Equal to "+(a==b));
		System.out.println("Not Equal to "+(a!=b));*/
	}
}
		