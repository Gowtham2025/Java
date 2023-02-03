import java.util.*;
class TestjavaCollection1{
public static void main(String args[])
{
ArrayList<String>list=new ArrayList<String>();
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