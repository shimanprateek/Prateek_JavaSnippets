import java.util.Scanner;

public class ScannerUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two Values");
		
		a= s.nextInt();
		b= s.nextInt();
		
		c= a+b;
		System.out.println("Addition Result: " + c);
		s.close();
	
		
	}

}
