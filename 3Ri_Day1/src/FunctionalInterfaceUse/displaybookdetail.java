package FunctionalInterfaceUse;

public interface displaybookdetail {
	
	public void display(String values);
	
	//default method
	default void display1() {
		System.out.println("Implementing Functional Interface default method");
	}
	
	//static method
	public static void display2()
	{
		System.out.println("Implementing Functional Interface");
	}
	

}
