class Sum
{
	int a,b,c;
	void add(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
	void display()
	{
		c=a+b;
		System.out.println("Total: "+c);
		//return a+b+c;
	}
}

class encap
{
	public static void main(String args[])
	{
		Sum obj=new Sum();
		obj.add(10,20);
		obj.display();
		//System.out.println(c);

	}
}