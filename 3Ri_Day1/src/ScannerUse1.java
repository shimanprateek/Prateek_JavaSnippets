import java.util.Scanner;
public class ScannerUse1 {



		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int a,b,c;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter two Values");
			
			a= s.nextInt();
			b= s.nextInt();
			
			
			if (a == b)
			{System.out.println("Two nnumbers are equal addition not performed");}
			else
			{   c= a+b;
				System.out.println("Addition Result: " + c);}
			
			s.close();	
			}

	}

