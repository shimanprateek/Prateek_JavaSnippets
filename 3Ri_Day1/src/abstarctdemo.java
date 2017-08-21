
abstract class a
{
	abstract void display();
	void display1()
	{
		System.out.println("A1");
	}
	}

class B extends a
{
	void display()
	{
		System.out.println("B");
	}
	
	void display2()
	{
		System.out.println("B1");
	}
}

class C extends a
{
	void display()
	{
		System.out.println("C");
	}
}
public class abstarctdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a a1 = new B();
		a1.display1();
		a1.display();
		a1 = new C();
		a1.display();
		
		B b = new B();
		b.display2();
	}

}
