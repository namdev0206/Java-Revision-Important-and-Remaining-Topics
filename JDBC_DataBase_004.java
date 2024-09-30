import java.sql.*;

class DataBase2
{
	public static void main(String args[])
	{
		try
		{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String host = "jdbc:mysql://localhost:3306/javadata";
			String username = "root";
			String pass = "";
			
			Connection con = DriverManager.getConnection(host, username, pass);
			Statement st = con.createStatement();
			String sql = "insert into javadatatable values(14,'Amit')";
			st.executeUpdate(sql);
			con.close();

			System.out.println("Table is Created");			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}