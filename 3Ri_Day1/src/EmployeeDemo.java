
// one public class should be used in one .java file
class Employee{
	int empid;       // instance variable
	String empName;  // instance variable
	void getData(int i,String n )                 // i and n are local variables to method
	{
		empid = i;
		empName = n;
	}
	void Display()
	{
		System.out.println(empid + ":" + empName);
	}
	
}

class Addon {
	int a,b;
	
	int add(int x, int y)
	{
		a=x;
		b=y;
		int addition = a+b;
		return addition;
	}
}

class Student{
	
	int rollno;
	String Name;
	int age;
	static String SchoolName;
	void getdetails (int x,String y,int z)
	{
		rollno = x;
		Name = y;
		age = z;
	}
	
	static							// static block can be used to invoke static variable.
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

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		Addon a = new Addon();
		e.getData(187972, "Prateek");
		e.Display();
		 int res = a.add(2,4);
		 System.out.println(res);
		//Student.getschoolname("Jaypee");
		Student s1 = new Student();
		Student s2 = new Student();
		s1.getdetails(187972, "Prateek", 28);
		s2.getdetails(187973, "Jamal", 27); 
		s1.display();
		s2.display();
		Student.getschoolname("Jaypee");
		s1.display();
		s2.display();
		//Student.getschoolname("Jaypee");
	}

}
