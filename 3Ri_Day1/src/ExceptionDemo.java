
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("Before");
		int a= 10;
//		int b = a/0;
		try
		{
			int b = a/0;
			//throw new numberten();
		}
		catch (NullPointerException |ArithmeticException e)
		{
			
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("Finally");
		}
		
		
		System.out.println("After");
	}

}
