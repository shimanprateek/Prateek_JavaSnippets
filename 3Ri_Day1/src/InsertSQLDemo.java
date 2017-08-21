import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class InsertSQLDemo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3307/jdbcex";
			String user="root";
			String password="root";
			//DML statement
			Connection con=DriverManager.getConnection(url,user,password);
			System.out.println("enter id");
			int id=s.nextInt();
			System.out.println("enter name");
			String name=s.next();
			System.out.println("enter age");
			int age=s.nextInt();
			String sql = "insert into emp values (?,?,?)";

			 PreparedStatement myStmt = con.prepareStatement(sql);

			// sets value to the given parameter index
			myStmt.setInt(1,id);
			myStmt.setString(2,name);
			myStmt.setInt(3,age);
			
			

			// 3. Execute SQL query
			myStmt.executeUpdate();

	}
		catch(Exception e)
		{
			
		}

}
}








//connection is an interface
//Driver Manager is a class
//getconnection is a method