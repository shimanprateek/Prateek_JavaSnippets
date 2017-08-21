class Student1{
	
	int rollno;
	String Name;
	int age;
	int marks;
	static String SchoolName;
	void getdetails (int rollno,String Name,int age,int marks)
	{
		this.rollno = rollno;
		this.Name = Name;
		this.age = age;
		this.marks = marks;
	}
	public void m1(String s)
	{
		SchoolName = s;
	}
	static							// static can be used to invoke static variable.
	{
		SchoolName = "KONARK";
	}
	
	void display()								// non static method can access static variable
	{
	System.out.println(rollno + " "+ Name + " " + age + " "+ SchoolName + " "+ marks);	
	}
	
	static void getschoolname(String s)       // static method cannot access non static variables ,only static variables can be used.
	{
		SchoolName = s;
	}
}

public class Useofthis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student1.SchoolName ="BISHOP";
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		
		s1.getdetails(187972, "Prateek", 28,400);
		s1.m1("SUHIT");
		//s1.getschoolname("BISHOP");+-9
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


