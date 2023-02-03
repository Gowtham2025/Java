class Student
{
	int rno=1023;
}
class Hostel extends Student
{
	void hos_det()
	{
		System.out.println("Roll No."+super.rno);
		System.out.println("Staying at hostel room");
	}
}
class single
{
	public static void main(String[] args)
	{
		Hostel.obj = new Hostel();
		obj.hos_det();
	}
}