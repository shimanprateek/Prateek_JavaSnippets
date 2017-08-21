package p1;

public class Functionality1 {
	
	int x;
	int y ;
	
	public Functionality1 (int x,int y)
	
	{
		this.x = x;
		this.y = y;
	}

	public int add()
	{
		int z= x+ y;
		return z;
		}
	
	public int sub()
	{
		int z= x - y;
		return z;
		}
	
	public int mul()
	{
		int z= x *y;
		return z;
		}
	public float div()
	{
		float z= (float)(x / y);
		return z;
		}
	
	public void printarray()
	
	{
		String [] s = new String[5];
		
		s[0] = "Prateek";
		s[1] = "Prateek1";
		s[2] = "Prateek2";
		s[3] = "Prateek3";
		s[4] = "Prateek4";
		
		for (String K : s)
		{
			System.out.println(K);
		}
	}
}
