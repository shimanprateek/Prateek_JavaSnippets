import java.util.Scanner;

public class SwitchLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day;
		//int day = 1;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter week Value");
		
		day= s.next();
		
		switch(day)
		{
			case "One":
				System.out.println("Monday");
				break;
			case "Two":
				System.out.println("Tuesday");
				break;
			case "Three":
				System.out.println("Wednesday");
				break;
			case "Four" :
				System.out.println("Thursday");
				break;
			case "Five" :
				System.out.println("Friday");
				break;
			case "Six" :
				System.out.println("Saturday");
				break;
			case "Seven":
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Invalid Value Provided");
			
		}
		s.close();
	}

}
