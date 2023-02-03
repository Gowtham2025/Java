 class kgm 
 {
   public static void main(String[] args)
  {
    int a[]= {10,20,30,35,25,50,45,60,90,38};
	
	int i,j;
	
	
	int b=0;
	
	for(i=0;i<a.length;i++)
	{
		for(j=i+1;j<a.length;j++){
		if(a[i]<a[j]){
		b=a[i];
		a[i]=a[j];
		a[j]=b;
	}
	
	}	
	}
	for(i=0;i<a.length;i++)
	{
	    System.out.print(a[i]+",");
	}
	System.out.println();
	System.out.println("Largest Second Maximum number: "+a[1]);
	
 }
}
