import java.io.*;

class Studentsp implements Serializable
{
	int id;
	String name;
	public Studentsp(int id,String name)
	{
		this.id = id;
		this.name = name;
	}

}


public class StudentSerial {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Studentsp s1 = new Studentsp(211,"ravi");
		
		FileOutputStream  fout = new FileOutputStream("f.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(s1);
		out.flush();
		System.out.println("success");
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
		Studentsp s = (Studentsp) in.readObject();
		System.out.println(s.id + ":" + s.name);
		
	}

}
