
public class InterfaceDemo extends K implements I1,I2{
	
public void add()
	{
		System.out.println(i + j);
		
	}
	
	public void sub()
	{
		System.out.println(i - j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		K c1 = new K();
		c1.add();
		c1.sub();
		System.out.println(i);
		System.out.println(j);
			
		}
	}


