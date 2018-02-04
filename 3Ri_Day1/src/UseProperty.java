import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class UseProperty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties p=new Properties();  
		p.setProperty("name","Prateek Gupta");  
		p.setProperty("email","shiman.prateek@gmail.com");  
		  
		p.store(new FileWriter("info.properties"),"Javatpoint Properties Example");  
		
		p.load(new FileReader("info.properties"));
		System.out.println(p.getProperty("name").toString());
		for (Map.Entry entry : p.entrySet())
		{
			System.out.println(entry.getKey() + "=" + entry.getValue());
			
		}

	}

}
