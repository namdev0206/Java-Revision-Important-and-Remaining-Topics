import java.util.*;
import java.sql.*;

class ExDatabase
{
	public static void main(String args[])throws Exception 
	{
		Scanner input = new Scanner(System.in);
		int rollno;
		String name;
		String course;
		
		System.out.println("Enter Student Details\n");
		System.out.println("Enter the Roll No	:	");
		rollno = input.nextInt();
		System.out.println("Enter Name			:	");
		name = input.next();
		System.out.println("Enter Course		:	");
		course = input.next();
		
		String sql = "INSERT INTO student VALUES("+rollno+", '"+name+"', '"+course+"')";
		System.out.println(sql);
		
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata", "root", "");
		
		Statement st = cn.createStatement();
		
		st.executeUpdate(sql);
		
		cn.close();
		
		System.out.println("Record Saved");
	}
}