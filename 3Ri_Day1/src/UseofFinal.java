  class x
{
	 final int a = 10;
	 
	 void change()
	{
	
	int  a =50;
	System.out.println(a);
	//System.out.println(super.a);
	}
	 
	final void change1()
	{
	
	//int  a =40;
	System.out.println(a);
	//System.out.println(super.a);
	}
	
	}

  class y extends x
{
	  int a =50;
	void change()
	{
	
	//int  a =30;
	System.out.println(super.a);
	//System.out.println(super.a);
	}
	
	void change2()
	{
	
	int  a =20;
	System.out.println(a);
	//System.out.println(super.a);
	}

}
public class UseofFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		x a = new y(); 
		a.change();
		a.change1();
		y b = new y(); 
		b.change2();
		}

}
