//print all the even numbers from 1 to 15
public class Whileloop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter =1;
		//int value = 8;
		while (counter <= 15)
		{
			int x = counter % 2;
			if (x == 0)
			{
				System.out.println(counter);
			}
			counter++;
			}
	}

}
