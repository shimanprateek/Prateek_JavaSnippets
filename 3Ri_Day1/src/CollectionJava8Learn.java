import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

import FunctionalInterfaceUse.displaybookdetail;

public class CollectionJava8Learn {

	// Functional Interface -- it only haves only and only one abstract method.Denoted by @FunctionalInterface
	
	public void display(Supplier<String> text)
	{
	 System.out.println("Print Supplier :" + text.get());
	}
	
	
	public static void main(String [] args)
	{
/*		displaybookdetail d = new displaybookdetail(){

			@Override
			public void display(String values) {
				// TODO Auto-generated method stub
				System.out.println("Implemented Inner Class : " + values);	
			}
		};
		System.out.println("First commit too new Rpo");
*/	
		displaybookdetail d = (values) -> {
				// TODO Auto-generated method stub
				System.out.println("Implemented Inner Class : " + values);	
			};
			
			displaybookdetail.display2();
			d.display1();
			d.display("Lambda Implemented");
			
			
			System.out.println("=====================================Function-Interface===================================================");
			
			
/*			@FunctionalInterface
			public interface Function<T,R>
			Represents a function that accepts one argument and produces a result.

			This is a functional interface whose functional method is apply(Object).			
*/			
			
			Function<String,Integer> func1 = x -> x.length();
			System.out.println(func1.apply("My name is prateek"));
			
			
			/*andThen
			default <V> Function<T,V> andThen(Function<? super R,? extends V> after)
			Returns a composed function that first applies this function to its input, and then applies the after function to the result.
			If evaluation of either function throws an exception, it is relayed to the caller of the composed function.*/
			
			Function<Integer,Integer> func2 = x -> x*2;
			System.out.println(func1.andThen(func2).apply("My name is Prateek"));
			
			
			/*This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.
			@FunctionalInterface
			public interface BinaryOperator<T>
			extends BiFunction<T,T,T>
			Represents an operation upon two operands of the same type, producing a result of the same type as the operands. 
			This is a specialization of BiFunction for the case where the operands and the result are all of the same type.*/
			
			System.out.println("=====================================BinaryOperator-Interface===================================================");
			
			BinaryOperator<Integer> func11 = (a,b) -> a+b;
			System.out.println(func11.apply(3, 5));
			
			System.out.println("=====================================UrinayOperator-Interface===================================================");
		    
			UnaryOperator<Integer> func12 = x -> x*6;
			System.out.println(func12.apply(5));
	
			List <String> ls = new ArrayList<String>();
			ls.add("Prateek");
			ls.add("Prastuti");
			ls.add("Prakhar");
			
			ls.replaceAll(x -> x.concat(" Gupta"));
			System.out.println(ls);
			
/*			Represents a predicate (boolean-valued function) of one argument.

			This is a functional interface whose functional method is test(Object).*/
			System.out.println("=====================================Predicate-Interface===================================================");
			Predicate<Integer> ps = x -> x>5;
			
			List<Integer> ls1 = Arrays.asList(6,2,9,4,7,1,3,4,2,0,8,6);
			
		    List<Integer> new_list = ls1.stream().filter(ps).collect(Collectors.toList());
		    
		    System.out.println(new_list);
		    
	        Predicate<String> ps1 = x -> x.contains("Gupta");
			
			List<String> ls2 = Arrays.asList("Prateek Gupta","Patas","Prateek","AmanGupta","Prastuti Gupta");
			
		    List<String> new_list_1 = ls2.stream().filter(ps1.negate()).collect(Collectors.toList());
		    
		    System.out.println(new_list_1);
			
		    
		    System.out.println("=====================================Consumer-Interface===================================================");
		    /*@FunctionalInterface
		    public interface Consumer<T>
		    Represents an operation that accepts a single input argument and returns no result. Unlike most other functional interfaces, Consumer is expected to operate via side-effects.*/		    
			
		    Consumer<String> ps3 = x -> System.out.print(x);
		    ps3.accept("This is my functional interface - Consumer \n");
		    ls2.forEach(ps3);
		    
		    System.out.println("\n=====================================Supplier-Interface===================================================");
		    
		    /*@FunctionalInterface
		    public interface Supplier<T>
		    Represents a supplier of results.
		    There is no requirement that a new or distinct result be returned each time the supplier is invoked.
		    This is a functional interface whose functional method is get().*/
		    
		    CollectionJava8Learn cs = new CollectionJava8Learn();
		    cs.display(() -> "Displays the supplied text");
		    
	}
}
