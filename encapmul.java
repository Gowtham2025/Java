class Detail
{
	double a,b,c;
	String name;
	
	void add(String name, double a, double b, double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.name=name;
	}
	void namedisplay()
	{
		
		System.out.println("Name: "+name);
		
	}
	double mul()
	{
		 return ((a*b*c)/100);
		//System.out.println("Multiplication: "+c);
	}
}

class encapmul
{
	public static void main(String args[])
	{
		Detail obj=new Detail();
		obj.add("Gowtham",12500,5.5,2);
		obj.namedisplay();
		double d=obj.mul();
		System.out.println(d);

	}
}