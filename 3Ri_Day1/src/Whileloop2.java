//print factors of 8
public class Whileloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter =1;
		int value = 8;
		while (counter <= 8)
		{
			int x = value % counter;
			if (x == 0)
			{
				System.out.println(counter);
			}
			counter++;
			}
		

	}

}
