import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw;
		FileReader fr;
		try {
			fw = new FileWriter("ab.txt");
			fw.write("Hello Java");
			fw.close();

			
			int i;
			fr = new FileReader("ab.txt");
			while ((i=fr.read()) != -1)
			{
				System.out.println((char)i);
			} }

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{

		}


	}
}


