//Display the data in SQL

import java.sql.*; //Import SQL Library

//Main Class
class DisplayData
{
	public static void main(String args[])
	{
		try
		{
			//Database Connectivity
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String host = "jdbc:mysql://localhost:3306/studentmb";
			String username = "root";
			String pass = "";
			
			Connection con = DriverManager.getConnection(host, username, pass);
			Statement st = con.createStatement();
			
			//Selection of Table to Display Data
			String sql = "select * from studenttbl";
			ResultSet rs=st.executeQuery(sql);
			
			while(rs.next())
			{
			      System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			con.close();

			//OUTPUT
			System.out.println("Table is Created");			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}