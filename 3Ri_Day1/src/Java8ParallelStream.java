import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class Java8ParallelStream {
	
	public static Boolean getprimenumber(int number)
	{
		if(number <= 1)
		{
			return false;
			}
			
		else
		{
			return !(IntStream.range(2,number/2).anyMatch(x -> number%x == 0));
		}
	}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ForkJoinPool corepools = ForkJoinPool.commonPool();
		
		System.out.println(corepools.getParallelism());
		
		long t1 = System.currentTimeMillis();
		
		long count = IntStream.iterate(0, n -> n+1).limit(1000000)
				.parallel()
				.filter(Java8ParallelStream :: getprimenumber).peek(System.out::println).count();
		
		long t2 = System.currentTimeMillis();
		
		System.out.println("Total prime numbers :" + count + " in time " + (t2-t1)/1000 );
		
	}

}
