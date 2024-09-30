import java.sql.*;
class DataBase1 
{
	public static void main(String args[])
	{
		try
		{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}


'javac' is not recognized as an internal or external command,
operable program or batch file.