import java.sql.*;



public class DBconnection

{

	public static Connection getConnection() throws ClassNotFoundException, SQLException

	{

	

	     //register the connection

		Class.forName("com.mysql.cj.jdbc.Driver");

		

		//establish the connection

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","Apshana123@");

		System.out.println("connection created");

		return con;

		

		

	}

}



