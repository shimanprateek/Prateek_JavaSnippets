import java.util.Scanner;

public class Arraylearn {
	
	int [] arrayname =  {1,2,3,4,5};
	
	void method1(){
		
		for (int i = 0;i<=4;i++)
		{System.out.println(arrayname[i]);}
	}
void method2(){
		
	for (int i = 0;i<arrayname.length;i++)
	{System.out.println(arrayname[i]);}
	}
void method3(){
	
	for(int i : arrayname)
	{
		System.out.println(i);
	}
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Arraylearn a = new Arraylearn();
//		a.method1();
//		a.method2();
//		a.method3();
		
		int i;
		int [] x = new int[3];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Elements:");
		for(i =0;i<x.length;i++)
		{
			x[i] = s.nextInt();
		}
		
		System.out.println("Array Elements are : " );
		
		for (int y : x)
		{
			System.out.println(y);
		}
		s.close();
	}

}
