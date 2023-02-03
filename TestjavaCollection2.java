import java.util.*;
class TestjavaCollection2{
public static void main(String args[])
{
LinkedList<String>list=new LinkedList<String>();
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