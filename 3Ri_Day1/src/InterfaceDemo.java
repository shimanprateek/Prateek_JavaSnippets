
public class InterfaceDemo extends K implements I1,I2{
	
public void add()
	{
	 
		System.out.println("Interface Demo implementing I1");
		System.out.println(i + j);
		
	}
	
	public void sub()
	{
		System.out.println(i - j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		I1 w = new InterfaceDemo();
		w.add();
		K c1 = new K();
		c1.add();
		c1.sub();
		System.out.println(i);
		System.out.println(j);
			
		}
	}


