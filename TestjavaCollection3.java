import java.util.*;
class TestjavaCollection3{
public static void main(String args[])
{
Vector<String>list=new Vector<String>();
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