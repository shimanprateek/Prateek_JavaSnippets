
public class Primenumber {
	
	public static Boolean getprimenumber(int number)
	{
		
		int i;
		int counter =0;
		Boolean result = null;
		
		counter = number/2;   // 17/2 = 8
		
		if(number == 0 || number ==1)
		{
			result = false;
		}else
		{
			for(i=2;i<counter;i++) // i=2 to 8
			{
				
				if(number % i == 0)  //  17/2 , 17/3 , 17/4, 17/5, 17/6,17/7 ,17/8
				{
					result = false;
					break;
				}else
				{
					result = true;   // true,true,true,true,true,true,true
				}
			}
		}
		
		return result;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 16;
		Boolean m = Primenumber.getprimenumber(number);
		if (m == true)
		{
			System.out.println(number + " : number is prime");	
		}else
		{
			System.out.println(number + " : number is not prime");
		}
		
	}

}
