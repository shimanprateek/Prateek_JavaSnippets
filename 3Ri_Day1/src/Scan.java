import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Scan {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int i;
		
		
		boolean x = false;
do {
		try
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter an Integer");
			i = s.nextInt();
			System.out.println(i);
			x = true;
		}
		catch (InputMismatchException e)
		{
			System.out.println("Value entered is wrong,Please enter the correct value:");
		}
		finally
		{
			System.out.println("Finally");
			FileWriter fw  = new FileWriter("ab.txt");
			fw.write("Hello Java");
			fw.close();		
		}

}while (!x);
	}

}
