
public class except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Before");
		int a= 10;
		
		
		
		//System.out.println(b);
		
		try{
			int b = a/0;
			System.out.println(b);
		}
		
		finally
		{
			System.out.println("Finally");
		}

	}

}
