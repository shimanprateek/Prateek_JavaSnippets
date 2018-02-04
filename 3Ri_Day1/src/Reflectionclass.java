
public class Reflectionclass {
	
	int x ;
	int y;
	
	public Reflectionclass()
	{
		System.out.println("DefaultConstructor");
	}
	
	public Reflectionclass(String Name)
	{
		System.out.println("Constructor : " + Name);
	}
	
	public void display(int x,int y)
	{
			this.x = x;
			this.y = y;
			
			System.out.println("Public Class Method :" + (this.x + this.y));
	}
	
	private void display1(int x,int y,String w)
	{

		this.x = x;
		this.y = y;
		
		System.out.println("Private Class Method :" + (this.x + this.y) + " "+w);
	}
	

}
