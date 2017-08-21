package p1;
//private members cannot be access outside class

class x {
 int a  = 50;
	
}

class y extends x {
	void show()
	
	{System.out.println(a);}
	
}
public class PrivateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			x X1 = new x();
			y y1 = new y();
			System.out.println(X1.a);
			y1.show();
			
	}

}
