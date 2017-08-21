class Students{
	
	int rollno;
	String Name;
	int age;
	int marks;
	static String SchoolName;
	void getdetails (int x,String y,int z,int w)
	{
		rollno = x;
		Name = y;
		age = z;
		marks = w;
	}
	
	static							// static can be used to invoke static variable.
	{
		SchoolName = "KONARK";
	}
	
	void display()								// non static method can access static variable
	{
	System.out.println(rollno + " "+ Name + " " + age + " "+ SchoolName);	
	}
	
	static void getschoolname(String s)       // static method cannot access non static variables ,only static variables can be used.
	{
		SchoolName = s;
	}
}




public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students();
		Students s2 = new Students();
		//Students.getschoolname("Amravati");
		s1.getdetails(187972, "Prateek", 28,400);
		s2.getdetails(187973, "Jamal", 27,800); 
		s1.display();
		s2.display();
		if (s1.marks >= s2.marks)
		{
			System.out.println("Marks of " + ": "+ s1.Name + " is greater then" + ":" + s2.Name );
		}
		else
		{
			System.out.println("Marks of " + ": "+ s2.Name + " is greater then" + ":" + s1.Name );
		}
	}

}
