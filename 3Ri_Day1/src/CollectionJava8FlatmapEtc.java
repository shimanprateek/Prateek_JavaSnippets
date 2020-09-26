import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import FunctionalInterfaceUse.MobileBrand;

public class CollectionJava8FlatmapEtc {
	//FlatMaps
	
		//You cannot apply certain methods of stream with below mentionde datatypes
		//Stream<String[]>
		//Stream<List<String>>
		//Stream<Set<String>>
		//Stream<List<Object>>
		// to over come this we use Flat maps

	public static void main(String [] args)
	{
		
		// Example 1
		String [][] data  = new String [][] {
			{"a","b"},
			{"c","d"},
			{"e","f"}
			};
		Stream<String[]> firststream = Arrays.stream(data); 
		//apply FLatmap
		Stream<String> thirdstream = firststream.flatMap(x -> Arrays.stream(x));
		
		Stream<String> SecondStream = thirdstream.filter(x -> x.equals("a"));
	
		SecondStream.forEach(System.out::println);
		
		Stream<String> composite = Arrays.stream(data).flatMap(x -> Arrays.stream(x)).filter(x->x.equals("f"));
		
		composite.forEach(System.out::println);
		
		//Example2
		
		MobileBrand b = new MobileBrand();
		b.Company ="Apple";
		b.adddevices("Iphone5");
		b.adddevices("Iphone6");
		b.adddevices("Iphone7");
		b.adddevices("Iphone7-Oneplus");
		b.adddevices("Iphone8-Oneplus");
		b.adddevices("Iphone9-Oneplus7");
		b.adddevices("Iphone8");
		b.adddevices("Iphone9");
		
		System.out.println(b.getDevices());
		MobileBrand b1 = new MobileBrand();
		b1.Company ="OnePlus";
		b1.adddevices("OnePlus5");
		b1.adddevices("OnePlus6");
		b1.adddevices("Iphone7-Oneplus");
		b1.adddevices("Iphone8-Oneplus");
		b1.adddevices("Iphone9-Oneplus7");
		b1.adddevices("OnePlus7");
		b1.adddevices("OnePlus8");
		b1.adddevices("OnePlus9");
	
		System.out.println(b1.getDevices());
		
		ArrayList<MobileBrand> mobiles = new ArrayList<>(); 
		mobiles.add(b);
		mobiles.add(b1);
		System.out.println(mobiles);
		
		List<String> devices_details = mobiles.stream().map(x -> x.getDevices()).flatMap(x -> x.stream()).distinct().collect(Collectors.toList());
		
		System.out.println("Flattened Device details : " + devices_details);
		//Example3
		
	}
}
