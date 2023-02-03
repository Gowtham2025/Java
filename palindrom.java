import java.util.*;
class palindrom
{
    public static void main(String[] args)
    {
    Scanner obj=new Scanner(System.in);
    String a;
    System.out.println("Enter Word & Letter: ");
    a=obj.nextLine();
    String b="";
    int c=a.length();
    for(int i=c-1;i>=0;i--)
    {
        b=b+a.charAt(i);
    }
   if(a.equals(b))
   {
       System.out.println(a+" is a palindrome");
   }
   else
   {
       System.out.println(a+" is not a palindrome");
   }
    
  
    }
}	