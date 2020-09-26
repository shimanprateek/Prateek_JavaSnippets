
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

class Book2 {    
int id;    
String name,author,publisher;    
int quantity;    
public Book2 (int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;
     
	
}
public static Comparator<Book2> namesort = new Comparator<Book2>()
{
	@Override
	public int compare(Book2 o1, Book2 o2) {
		// TODO Auto-generated method stub
		return (o1.name.compareTo(o2.name));
		
	}
};

public static Comparator<Book2> publishersort = new Comparator<Book2>()
{
	@Override
	public int compare(Book2 o1, Book2 o2) {
		// TODO Auto-generated method stub
		return (o1.publisher.compareTo(o2.publisher));
		
	}
};

public static Comparator<Book2> IDsort = new Comparator<Book2>()
{
	@Override
	public int compare(Book2 o1, Book2 o2) {
		// TODO Auto-generated method stub
		return (o1.id - (o2.id));
		
	}
};

public static Comparator<Book2> Quantitysort = new Comparator<Book2>()
{
	@Override
	public int compare(Book2 o1, Book2 o2) {
		// TODO Auto-generated method stub
		return (o1.quantity - (o2.quantity));
		
	}
};


  
}

public class collectionLearnrecent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Book2> al=new ArrayList<Book2>();    
	    //Creating Books    
	    Book2 b1=new Book2(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	    Book2 b2=new Book2(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    Book2 b3=new Book2(103,"Operating System","Galvin","Wiley",6); 
	    Book2 b4=new Book2(104,"Operations","Gallelio","Dahiya",25);
	    
	    al.add(b2);  
	    al.add(b1);  
	    al.add(b3);  
	    System.out.println("------------------BeforeReversal----------------");
	    System.out.println(al);
	    for(Book2 b : al)
	    {
	    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }
	    Collections.reverse(al);
	    System.out.println("------------------AfterReversal----------------");
	    System.out.println(al);
	    for(Book2 b : al)
	    {
	    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }
	    
	    System.out.println("----------------ListIteration----------------");
	    al.add(2, b4);
	    ListIterator<Book2> l = al.listIterator();
	    while (l.hasNext())
	    {
	    	
	    	Book2 b = l.next();
	    	System.out.println((b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity));
	    }
	   // al.add(2, b4);
	  
	    Collections.sort(al,Book2.IDsort);
	    System.out.println("----------------SortedListIterationbased on ID----------------");
	    for(Book2 b : al)
	    {
	    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }
	    Collections.sort(al,Book2.namesort);
	    System.out.println("----------------SortedListIterationbased on name----------------");
	    for(Book2 b : al)
	    {
	    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }
	    Collections.sort(al,Book2.publishersort);
	    System.out.println("----------------SortedListIterationbased on publisher---------------");
	    for(Book2 b : al)
	    {
	    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }
	    Collections.sort(al,Book2.Quantitysort);
	    System.out.println("----------------SortedListIterationbased on quantity----------------");
	    for(Book2 b : al)
	    {
	    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }
	    
	    /*Collections.sort(al,new Comparator<Book2>()
	    {
	    	@Override
	    	public int compare(Book2 o1, Book2 o2) {
	    		// TODO Auto-generated method stub
	    		return (o1.author.compareTo(o2.author));
	    		
	    	}
	    }*/
	    
	    // Use of Lambda Expression
	    Collections.sort(al,(Book2 o1, Book2 o2) -> {
	    		// TODO Auto-generated method stub
	    		return (o1.author.compareTo(o2.author));
	    		
	    	
	    }
	    		);
	    System.out.println("----------------SortedListIterationbased on Author----------------");
	    for(Book2 b : al)
	    {
	    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }
	}

}
