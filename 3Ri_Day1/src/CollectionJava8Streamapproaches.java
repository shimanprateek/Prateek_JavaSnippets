import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import org.omg.CORBA.portable.Streamable;

public class CollectionJava8Streamapproaches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.Stream Object
		
		Stream<String> stream = Stream.of("Prateek","Prastuti","Prakhar","Rosy","Charu","Chinu");
		stream.findFirst().ifPresent(System.out::println);
		
		//2.Stream from List
		
		 Arrays.asList("Prateek","Prastuti","Prakhar","Rosy","Charu","Chinu").stream()
		 .findFirst().map(x -> x.length()).ifPresent(System.out::println);
		 
		 //3.range 
		 
		 IntStream.range(1,11).forEach(System.out::println);
		 
		 //4.Using Arrays.stream()
		 
		 int [] arr = {1,2,3,4,5,6,7,8,9,10};
		   Arrays.stream(arr).map(n -> n* 2).forEach(System.out::println);
		   
		 //5. String DataObjects
		  
		   Stream.of("a1","a2","a3","a4","a5","a6")
		   .map(x ->x.substring(1))
		   .mapToInt(x -> Integer.parseInt(x))
		   .max()
		   .ifPresent(System.out::println);
		  
		 //6. doubles to string object 
		   
		   Stream.of(1.00,2.00,3.00,4.00,5.00).mapToInt(Double :: intValue).mapToObj(x -> "add" + x).forEach(System.out::println);
		   
		 //7. limit
		   
		   Stream.iterate(1, x -> 2*x+1).limit(10).forEach(System.out::println);
		   
		 //8.factorial
		   
		 long value = LongStream.rangeClosed(1, 5).reduce(1,(a,b) -> a*b);
		 System.out.print(value);
		 
	}

}
