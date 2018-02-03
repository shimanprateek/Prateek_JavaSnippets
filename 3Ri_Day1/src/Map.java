import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;


public class Map  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap <Integer,String> h = new HashMap<>();
		h.put(null,"");
		h.put(101, "");
		h.put(102, "Jamal1");
		h.put(91, "Jamal2");
		h.put(104, "Jamal3");
		System.out.println("----HashMAp----");
		System.out.println(h);
		
		System.out.println("----HashMAp Iteraion using Entry----");
		for (Entry<Integer, String> entry : h.entrySet())
		{
			System.out.println(entry.getKey() +" : " +entry.getValue());
		}
		
		System.out.println("----HashMAp Iteraion using Arraylist----");
		ArrayList <Integer> al = new  ArrayList <Integer>(h.keySet());
		//System.out.println(al);
		
		for(Integer x : al )
		{
			System.out.println(h.get(x));
		}
		
		//System.out.println(h);
		System.out.println("----LinkedHashMAp----");
		LinkedHashMap <Integer,String> h1 = new LinkedHashMap<>();
		h1.put(null,"");
		h1.put(101, "");
		h1.put(102, "Jamal1");
		h1.put(99, "Jamal2");
		h1.put(104, "Jamal3");
		
		System.out.println(h1);
		
		TreeMap <Integer,String>  t1= new TreeMap<>();
		t1.put(99,"Prateek");
		t1.put(101, "");
		t1.put(102, "Jamal1");
		t1.put(104, "Jamal2");
		t1.put(100, "Jamal3");
		t1.put(106, "Jamal3");
		
		System.out.println("----TreeMap----");		
		System.out.println(t1);

	}

	
	

}
