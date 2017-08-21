class Parents
{
String surname = "Gupta";	

void show()
{ 
	//System.out.println(surname);
	System.out.println(surname);
	}
}


class childs extends Parents
{
String surname = "Prateek";
void show()
{ 
	System.out.println(surname);
	System.out.println(super.surname);
	super.show();
	}

void d()
{
	super.show();
	}
}
public class SuperUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childs c = new childs();
		c.show();
		c.d();
	}

}
