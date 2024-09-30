import java.sql.*;  //SQL Library Import
import java.util.*;  //Import Java Library

class DBMenu
{
	Scanner dbinput = new Scanner(System.in);
	
	int rollno;
	String name;
	String course;
	String duration;
	
	void insert()throws Exception
	{	
		System.out.println("Enter Student Details\n");
		System.out.println("Enter the Roll No	:	");
		rollno = dbinput.nextInt();
		System.out.println("Enter Name			:	");
		name = dbinput.next();
		System.out.println("Enter Course		:	");
		course = dbinput.next();
		System.out.println("Enter Course Duration :	");
		duration = dbinput.next();
		
		//Insert the values into Database
		String sql = "INSERT INTO studenttbl VALUES  
		("+rollno+", '"+name+"', '"+course+"', '"+duration+"')";
		
		//Load Driver
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		
		Connection cn = DriverManager.getConnection
		("jdbc:mysql://localhost:3306/studentmb", "root", "");
		
		Statement st = cn.createStatement();
		st.executeUpdate(sql);
		cn.close();
		System.out.println("Record Saved");
	}	
	
	void update()
	{
		System.out.println("Enter the Roll No. you want to Update the Details = ");
		rollno =  dbinput.nextInt();
		
		System.out.println("Enter Updated Name = ");
		name =  dbinput.next();
		
		System.out.println("Enter Updated Course = ");
		course =  dbinput.next();
		
		System.out.println("Enter Updated Duration = ");
		duration =  dbinput.next();
		
		String sql = "UPDATE studenttbl
		SET name = '"+name+"', course = '"+course+"', duration = '"+duration+"'
		WHERE rollno = "+rollno+"";
		
		System.out.println(sql);
								
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmb", "root", "");
		Statement st = cn.createStatement();
		st.executeUpdate(sql);
		cn.close();
		System.out.println("Record Updated");
	}
}


//Main Class
class MenuBase
{
	public static void main(String args[])throws Exception
	{
		//For Input
		Scanner input = new Scanner(System.in);
		
		//Object Define for Method
		DBMenu db = new DBMenu();
		
		//Variable
		int num;
		
		System.out.println("Select the Button\n\nPress 1 to INSERT\nPress 2 to DISPLAY");
		System.out.print("Press 3 to DELETE\nPress 4 to UPDATE\n\nChoose the VALUE = ");
		num = input.nextInt();
		
		switch(num)
		{
			case 1:
				db.insert();
				break;
			
			case 4:
				db.update();
				break;
		}
	}
}



/*void display()throws Exception
	{
		String sql = "SELECT * FROM STUDENT";
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentMB", "root", "");
		Statement st = cn.createStatement();
		st.executeUpdate(sql);
		cn.close();
		System.out.println("Record Displayed");
	}*/
	
	/*			
			case 2:
				db.display();
				break;
				
			case 3:

				break;
*/					

/*
	void delete()
	{
		
	}
	*/