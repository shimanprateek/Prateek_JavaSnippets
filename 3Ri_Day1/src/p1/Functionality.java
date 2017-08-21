package p1;

  class add {
	int x,y;
	public add()
	{}
	 public add(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	
	protected int addno()
	{
		int z = x+y;
		
		return z;
		
	}
}

 class sub extends add
{
	
public int subtractno()
{		
	int k = addno();
	System.out.println("Addition: " + k);
	 int z = x - y;
	return z;
	 
}

}

public class Functionality extends sub{
	
	public Functionality(int x,int y)
	{
		
		super.x = x;
		super.y = y;
	}
}
