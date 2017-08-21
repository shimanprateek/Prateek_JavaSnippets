import java.util.*;

public class Iteratoruse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList <Integer> al = new ArrayList<>();
al.add(10);
al.add(20);
al.add(30);

	Iterator<Integer> e = al.iterator();
	//System.out.println(e);
	ListIterator<Integer> l = al.listIterator();
	System.out.println("--Iterator--"); // can be used with both List and Set
	while (e.hasNext())
	{	
		System.out.println(e.next());		
	}
	System.out.println("--ListIterator Forward--"); // List Iterator can only be used with ArrayList and Linkedlist
	while (l.hasNext())
	{
		
		System.out.println(l.next());
	}
	System.out.println("--ListIterator Backward--");
	while (l.hasPrevious())
	{
		
		System.out.println(l.previous());
	}
	}

}
