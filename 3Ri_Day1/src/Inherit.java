
class Parent
{
String surname = "Gupta";	
}

class child extends Parent
{
String name = "Prateek";
void show()
{ 
	System.out.println(name + " " +surname);
	}
}

public class Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		child c = new child();
		c.show();
	}

}
