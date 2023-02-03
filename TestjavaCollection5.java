import java.util.*;
class TestjavaCollection5{
public static void main(String args[])
{
PriorityQueue<String>list=new PriorityQueue<String>();
list.add("Ravi");
list.add("Viajy");
list.add("Ravi");
list.add("Ajay");
System.out.println("head:"+list.element());
System.out.println("head:"+list.peek());
System.out.println("iterating the queue elements:");
Iterator list=list.iterator();
while(list.hasNext())
{
System.out.println(list.next());
}
queue.remove();
queue.poll();
System.out.println("after removing two elements:");
Iterator<String>list2=queue.iterator();
while(list2.hasNext())
{
System.out.println(list2.next());
}
}
}