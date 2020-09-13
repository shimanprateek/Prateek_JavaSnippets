import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> al = new ArrayList<>();
		al.add(4);
		al.add(2);
		al.add(4);
		//al.add(6);
		//al.add(arg0, arg1);
		//boolean bool = al.contains(2);
		//int bool = al.indexOf(4);
		System.out.println("----ArrayList---");
		for(int n : al)
		{
			System.out.println(n);
			//System.out.println(bool);
		}
		
		
		LinkedList <Integer> l = new LinkedList<>();
		l.add(4);
		l.add(2);
		l.add(4);
		l.add(6);
		System.out.println("----LinkedList---");
		//Boolean bool = al.equals(l);
		for (Integer x : l)
		{
			
			System.out.println(x);
			//System.out.println(bool);
		}
		
		
		HashSet <Integer> hs = new HashSet<>();
		hs.add(4);
		hs.add(2);
		hs.add(4);
		hs.add(6);
		System.out.println("----HashSet---");
		for (Integer x : hs)
		{
			
			System.out.println(x);
		}
		
		
		LinkedHashSet <Integer> lhs = new LinkedHashSet<>();
		lhs.add(4);
		lhs.add(2);
		lhs.add(4);
		lhs.add(6);
		System.out.println("----LinkedHashSet---");
		for (Integer x : lhs)
		{
			
			System.out.println(x);
		}
		
		
		TreeSet <Integer> ts = new TreeSet<>();
		ts.add(4);
		ts.add(6);
		ts.add(4);
		ts.add(2);
		System.out.println("----TreeSet---");
		for (Integer x : ts)
		{	
			System.out.println(x);
		}
		
		
		Set<String> s = new HashSet();
		
		String [] names ={"Rosy","Fauji","Prateek","Rosy"};
		List<String> ls = Arrays.asList(names);
		for(String name : names )
		{
			if(s.add(name) == false)
			{
				System.out.println("Duplicate Found : " + name);
			}
		}
		System.out.println(s);
	}

}
