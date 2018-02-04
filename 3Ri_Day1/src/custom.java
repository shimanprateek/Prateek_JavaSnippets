
public class custom {

	
	public void check (int age)
	{
		if (age < 18)
		{
			
			throw new ArithmeticException("Age to vote is not valid");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		custom a = new custom();
		try
		{
		a.check(17);
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
