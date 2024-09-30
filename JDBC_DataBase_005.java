import java.sql.*; //SQL Library Import

class database
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/testdb", "root", "");

			System.out.println("\n\nConnection Successfull\n");
			System.out.println("The database values are given below");

			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(select * from testdb1);
			
			while(rs.next())
			{
				System.out.println(rs.getString(1) + " " + rs.getString(2));
			}
			con.close(); 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

//cmd
//javac -cp driver.jar;. database.java