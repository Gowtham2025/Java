class twodim
{
	public static void main(String[] args)
	{
	int a[][]={{1,2,3},{4,5,6}};
	int row,col;
	for (row=0;row<3;row++)
	{
		for(col=0;col<3;col++)
		{
			System.out.print(a[row][col]+" ");
		}
		System.out.println();
	}
	
	}
}