import java.sql.*;
import java.util.Scanner;

class DBMenu {
    Scanner dbinput = new Scanner(System.in);

    int rollno;
    String name;
    String course;
    String duration;

    void insert() {
        try {
            System.out.println("Enter Student Details\n");
            System.out.print("Enter the Roll No: ");
            rollno = dbinput.nextInt();
            dbinput.nextLine(); // consume newline

            System.out.print("Enter Name: ");
            name = dbinput.nextLine();

            System.out.print("Enter Course: ");
            course = dbinput.nextLine();

            System.out.print("Enter Course Duration: ");
            duration = dbinput.nextLine();

            String sql = "INSERT INTO studenttbl (rollno, name, course, duration) VALUES (?, ?, ?, ?)";

            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            try (Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmb", "root", "");
			
			PreparedStatement pst = cn.prepareStatement(sql)) 
			{

                pst.setInt(1, rollno);
                pst.setString(2, name);
                pst.setString(3, course);
                pst.setString(4, duration);

                pst.executeUpdate();
                System.out.println("Record Saved");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    void update() {
        try {
            System.out.print("Enter the Roll No. you want to update: ");
            rollno = dbinput.nextInt();
            dbinput.nextLine(); // consume newline

            System.out.print("Enter Updated Name: ");
            name = dbinput.nextLine();

            System.out.print("Enter Updated Course: ");
            course = dbinput.nextLine();

            System.out.print("Enter Updated Duration: ");
            duration = dbinput.nextLine();

            String sql = "UPDATE studenttbl SET name = ?, course = ?, duration = ? WHERE rollno = ?";

            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            try (Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmb", "root", "");
                 PreparedStatement pst = cn.prepareStatement(sql)) {

                pst.setString(1, name);
                pst.setString(2, course);
                pst.setString(3, duration);
                pst.setInt(4, rollno);

                pst.executeUpdate();
                System.out.println("Record Updated");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class Nothing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DBMenu db = new DBMenu();

        System.out.println("Select the Button\n\nPress 1 to INSERT\nPress 2 to DISPLAY\nPress 3 to DELETE\nPress 4 to UPDATE");
        System.out.print("Choose the VALUE = ");
        int num = input.nextInt();

        try {
            switch (num) {
                case 1:
                    db.insert();
                    break;
                case 4:
                    db.update();
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1, or 4.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}
