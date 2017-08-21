class shape
{
	void draw()
	{
		System.out.println("draw shape");	
	}
	void draw1()
	{
		System.out.println("draw Circle");	
	}
}

class circle extends shape
{
	void draw()
	{
		System.out.println("draw Circle");	
	}
	
	void draw2()
	{
		System.out.println("draw Circle");	
	}
	
}

class rectangle extends shape
{
	
	void draw()
	{
		System.out.println("draw Rectangle");	
	}

}

public class ShapeDemoSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			shape s1 = new shape();
//			circle c1 = new circle();
//			rectangle r1 = new rectangle();
//			s1.draw();
//			c1.draw();
//			r1.draw();
		
		shape s1 = new circle();
		s1.draw();	
		s1= new rectangle();
		s1.draw();
		s1.draw1();
		
		
	}

}
