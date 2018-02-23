import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

class Book3 {    
int id;    
String name,author,publisher;    
int quantity;    
public Book3(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}    
}
public class MapLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Creating map of Book3s    
		TreeMap<Integer,Book3> map=new TreeMap<Integer,Book3>();    
	    //Creating Book3s    
	    Book3 b1=new Book3(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	    Book3 b2=new Book3(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    Book3 b3=new Book3(103,"Operating System","Galvin","Wiley",6); 
	    
	    map.put(2,b2);  
	    map.put(1,b1);  
	    map.put(3,b3);  
	      
	    System.out.println(map);	
	    NavigableMap<Integer, Book3> nmap = map.descendingMap();
	    
	    for (NavigableMap.Entry<Integer,Book3> entry : nmap.entrySet())
	    {
	    	int key=entry.getKey();  
	        Book3 b=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
	    }
	    
	  System.out.println("----------Normal traversing using Arraylist------------");
	  
	    ArrayList <Integer> al = new  ArrayList <Integer>(map.keySet());
	    
	    for (Integer x:al)
	    {
	    	Book3 b = map.get(x);
	    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
	    }
	    
	    Set <Entry<Integer,Book3>> set = map.entrySet();
	    ArrayList <Entry<Integer,Book3>> list = new ArrayList <Entry<Integer,Book3>>(set);
	    
	    Collections.sort(list, new Comparator<Map.Entry<Integer,Book3>>(){

			@Override
			public int compare(Entry<Integer, Book3> o1, Entry<Integer, Book3> o2) {
				// TODO Auto-generated method stub
				
				return 	o1.getValue().quantity - o2.getValue().quantity;
			
			}

	    	
	    });
	  System.out.println("-----------After Sorting---------");
	   for(Entry<Integer,Book3> entry : list)
	   {
		   Book3 b = entry.getValue();
		   System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity); 
	   }
	}

}
