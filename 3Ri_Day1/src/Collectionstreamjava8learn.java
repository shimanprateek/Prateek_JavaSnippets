import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import FunctionalInterfaceUse.BooksforJava8;

public class Collectionstreamjava8learn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<BooksforJava8> list = Arrays.asList(new BooksforJava8(101,"Let us C",450,"Yashwant Kanetkar","BPB",8),
				new BooksforJava8(103,"Data Communications & Networking",540,"Forouzan","Mc Graw Hill",4),
				new BooksforJava8(102,"Operating System",751,"Galvin","Wiley",106),
				new BooksforJava8(105,"Operations",200,"Gallelio","Dahiya",25),
				new BooksforJava8(104,"AI",120,"Becky","TMH",60)
				);

		//streams filter API	
		//Filter utilizes predicate Functional Interface
		System.out.println("========================streams filter API========================");
		
		List <BooksforJava8> filter_learn = list.stream().filter(x -> x.getQuantity() <= 10)
				.collect(Collectors.toList());
		
		 BooksforJava8 bo =  list.stream().filter(x -> x.getQuantity() <= 10)
		.findAny()
		.orElse(null);
		
		System.out.println(bo.getAuthor());
			
		//filter_learn1.forEach(x -> System.out.println(x.getId() + "||" + x.getAuthor() + "||" + x.getName() +  "||" + x.getQuantity() + "||" + x.getPublisher()));
		filter_learn.forEach(x -> System.out.println(x.getId() + "||" + x.getAuthor() + "||" + x.getName() +  "||" + x.getQuantity() + "||" + x.getPublisher()+ "||" + x.getPrice()));
		
		//streams sort API	
		//sort utilizes Comparator Functional Interface
		System.out.println("========================streams sorted API========================");
		Comparator<BooksforJava8> sortbyquantity= (o1,o2) -> o1.getQuantity() -(o2.getQuantity()); 
	     
		List <BooksforJava8> sort_learn = list.stream().sorted(sortbyquantity).collect(Collectors.toList());
		
		sort_learn.forEach(x -> System.out.println(x.getId() + "||" + x.getAuthor() + "||" + x.getName() +  "||" + x.getQuantity() + "||" + x.getPublisher()+ "||" + x.getPrice()));
		
		//streams map API	
	    //Map utilizes Function Functional Interface
		System.out.println("========================Stream map API========================");
		
		
		
		//streams collect API	
	    //collect utilizes Collectors Functional Interface and its methods
		
	    HashMap <Integer,String> map_demo =  (HashMap<Integer, String>) list.stream().filter(x -> x.getQuantity() <= 10).collect(Collectors.toMap(x->x.getQuantity(), x -> x.getAuthor()));
		System.out.println("map_demo " + map_demo);
		Set <String> set_demo =   list.stream().filter(x -> x.getQuantity() <= 10).map(x -> x.getName()).collect(Collectors.toSet());
		System.out.println("set_demo :" + set_demo);
		
		
		//getting max and min
		BooksforJava8 maxvlue = list.stream().max((o1,o2) -> o1.getPrice() > o2.getPrice()?1:-1).get();
		System.out.println("Book having maximum price : "+maxvlue.getId() + "||" + maxvlue.getAuthor() + "||" + maxvlue.getName() +  "||" + maxvlue.getQuantity() + "||" + maxvlue.getPublisher() +"||" + maxvlue.getPrice());
		
		//get min value
		BooksforJava8 minvlue = list.stream().max((o1,o2) -> o1.getPrice() < o2.getPrice()?1:-1).get();
		System.out.println("Book having minimum price : "+minvlue.getId() + "||" + minvlue.getAuthor() + "||" + minvlue.getName() +  "||" + minvlue.getQuantity() + "||" + minvlue.getPublisher() +"||" + minvlue.getPrice());
		
		//total price
		Integer totalquantity =     list.stream().collect(Collectors.summingInt(x -> x.getQuantity()));
		System.out.println("totalquantity of books : " + totalquantity);
		
		//total price by reduce method
		//Optional<Integer> totalquantity1 =     list.stream().map(x -> x.getQuantity()).reduce((x,y) -> x+y);
				Integer totalquantity1 =     list.stream().map(x -> x.getQuantity()).reduce((int )0.00,Integer::sum);
				System.out.println("totalquantity of books by reduction : " + totalquantity1);
				
		//total price by sum method
		//Optional<Integer> totalquantity1 =     list.stream().map(x -> x.getQuantity()).reduce((x,y) -> x+y);
				Integer totalquantity3 =     list.stream().mapToInt(x -> x.getQuantity()).sum();
				System.out.println("totalquantity of books by MapperInt : " + totalquantity3);
	}
	
}
