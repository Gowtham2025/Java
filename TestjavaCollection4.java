import java.util.*;
class TestjavaCollection4{
public static void main(String args[])
{
Stack<String>list=new Stack<String>();
list.add("Ravi");
list.add("Viajy");
list.add("Ravi");
list.add("Ajay");
Iterator itr=list.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}