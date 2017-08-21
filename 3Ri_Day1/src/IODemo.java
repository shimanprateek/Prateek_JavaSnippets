import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IODemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw  = new FileWriter("ab.txt");
		fw.write("Hello Java");
		fw.close();
		
		FileReader fr = new FileReader("ab.txt");
		int i;
		while ((i=fr.read()) != -1){
			System.out.println((char)i);
		}
	}

}
