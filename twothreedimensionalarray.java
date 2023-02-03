class twodim
{
	public static void main(String[] args)
	{
	int a[][]={{1,2,5,5,3},{3,4,5,3,2},{6,7,8,1,3},{9,0,2,4,6}};
	int row,col;
	for (row=0;row<4;row++)
	{
		for(col=0;col<4;col++)
		{
			System.out.print(a[row][col]+" ");
		}
		System.out.println();
	}
	
	}
}