import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

class Book1 implements Comparable<Book1> {    
int id;    
String name,author,publisher;    
int quantity;    
public Book1(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}
@Override
public int compareTo(Book1 o) {
	// TODO Auto-generated method stub
	if (id > o.id)
	return 1;
	else if (id<o.id)
		return -1;
	else
	return 0;	
}    
}

public class collectionLearnrecent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Book1> al=new ArrayList<Book1>();    
	    //Creating Books    
	    Book1 b1=new Book1(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	    Book1 b2=new Book1(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    Book1 b3=new Book1(103,"Operating System","Galvin","Wiley",6); 
	    Book1 b4=new Book1(104,"Operations","Gallelio","Chutiya",25);
	    
	    al.add(b2);  
	    al.add(b1);  
	    al.add(b3);  
	    System.out.println("------------------BeforeReversal----------------");
	    System.out.println(al);
	    for(Book1 b : al)
	    {
	    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }
	    Collections.reverse(al);
	    System.out.println("------------------AfterReversal----------------");
	    System.out.println(al);
	    for(Book1 b : al)
	    {
	    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }
	    
	    System.out.println("----------------ListIteration----------------");
	    al.add(2, b4);
	    ListIterator<Book1> l = al.listIterator();
	    while (l.hasNext())
	    {
	    	
	    	Book1 b = l.next();
	    	System.out.println((b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity));
	    }
	   // al.add(2, b4);
	   
	    Collections.sort(al);
	    System.out.println("----------------SortedListIteration----------------");
	    for(Book1 b : al)
	    {
	    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }
	}

}
