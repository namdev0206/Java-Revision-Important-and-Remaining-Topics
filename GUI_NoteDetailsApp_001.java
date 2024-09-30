//GUI

import java.awt.*;  //Abstract Window Toolkit
import javax.swing.*;  //Import Java Swing Library
import java.awt.event.*;  //To Perform an event


class FirstApp extends Frame
{
	Label lblUserId, lblPassword, lblUserName, lblAddress;
	Label lblGender, lblCourses, lblCountry;
	
	TextField txtUserId, txtPassword, txtUserName;
	TextArea taAddress;
	Checkbox chkTnC;
	Checkbox optMale, optFemale;
	CheckboxGroup gender;
	List lstCourses;
	Choice cboCountries;
	Button cmdSubmit;
	
	public FirstApp()
	{
		lblUserId = new Label("User Id");
		lblPassword = new Label("Password");
		lblUserName = new Label("User Name");
		lblAddress = new Label("Address");
		lblGender = new Label("Gender");
		lblCourses = new Label("Courses");
		lblCountry= new Label("Country");
		
		txtUserId = new TextField(20);
		
		txtPassword = new TextField(20);
		txtPassword.setEchoChar('*');
		
		txtUserName = new TextField(20);
		
		taAddress = new TextArea(5, 20);
		
		chkTnC = new Checkbox("Agree with Terms & Conditions");
		
		gender = new CheckboxGroup();
		optMale = new Checkbox("Male" , gender, true); // Doubt
		optFemale = new Checkbox("Female" , gender, false);
		
		lstCourses = new List(4 , true);
		lstCourses.add("Java");
		lstCourses.add(".Net");
		lstCourses.add("PHP");
		lstCourses.add("Linux");
		lstCourses.add("Hibernate");
		lstCourses.add("Spring");
		
		cboCountries = new Choice();
		cboCountries.add("India");
		cboCountries.add("Pakistan");
		cboCountries.add("China");
		cboCountries.add("US");
		cboCountries.add("Japan");
		
		cmdSubmit = new Button("Submit");
		
		add(lblUserId);
		add(txtUserId);
		add(lblPassword);
		add(txtPassword);
		add(lblAddress);
		add(taAddress);
		add(lblGender);
		add(optMale);
		add(optFemale);
		add(lblCountry);
		add(cboCountries);
		add(lblCourses);
		add(lstCourses);
		add(chkTnC);
		add(cmdSubmit);
		
		setLayout(new FlowLayout());
		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		new FirstApp();
	}
}




// Import necessary packages for GUI creation and event handling
import java.awt.*;  // Abstract Window Toolkit
import javax.swing.*;  // Import Java Swing Library (Note: Not used in this code)
import java.awt.event.*;  // To handle events (Note: Not used in this code)

// Define a class FirstApp that extends Frame to create a windowed application
class FirstApp extends Frame
{
    // Declare GUI components
    Label lblUserId, lblPassword, lblUserName, lblAddress;
    Label lblGender, lblCourses, lblCountry;
    
    TextField txtUserId, txtPassword, txtUserName;  // Text fields for user input
    TextArea taAddress;  // Multi-line text area for address input
    Checkbox chkTnC;  // Checkbox for terms and conditions
    Checkbox optMale, optFemale;  // Radio buttons for gender selection
    CheckboxGroup gender;  // Group for gender radio buttons
    List lstCourses;  // List for selecting multiple courses
    Choice cboCountries;  // Drop-down menu for country selection
    Button cmdSubmit;  // Button to submit the form

    // Constructor for the FirstApp class
    public FirstApp()
    {
        // Initialize labels with text
        lblUserId = new Label("User Id");
        lblPassword = new Label("Password");
        lblUserName = new Label("User Name");
        lblAddress = new Label("Address");
        lblGender = new Label("Gender");
        lblCourses = new Label("Courses");
        lblCountry = new Label("Country");
        
        // Initialize text fields with specific number of columns
        txtUserId = new TextField(20);
        txtPassword = new TextField(20);
        txtPassword.setEchoChar('*');  // Set echo character for password field
        txtUserName = new TextField(20);
        
        // Initialize text area with rows and columns
        taAddress = new TextArea(5, 20);
        
        // Initialize checkbox for terms and conditions
        chkTnC = new Checkbox("Agree with Terms & Conditions");
        
        // Initialize gender radio buttons and group them together
        gender = new CheckboxGroup();
        optMale = new Checkbox("Male", gender, true);  // Default to Male
        optFemale = new Checkbox("Female", gender, false);
        
        // Initialize list with multiple courses and allow multiple selections
        lstCourses = new List(4, true);
        lstCourses.add("Java");
        lstCourses.add(".Net");
        lstCourses.add("PHP");
        lstCourses.add("Linux");
        lstCourses.add("Hibernate");
        lstCourses.add("Spring");
        
        // Initialize choice (drop-down menu) for country selection
        cboCountries = new Choice();
        cboCountries.add("India");
        cboCountries.add("Pakistan");
        cboCountries.add("China");
        cboCountries.add("US");
        cboCountries.add("Japan");
        
        // Initialize submit button
        cmdSubmit = new Button("Submit");
        
        // Add components to the frame
        add(lblUserId);
        add(txtUserId);
        add(lblPassword);
        add(txtPassword);
        add(lblAddress);
        add(taAddress);
        add(lblGender);
        add(optMale);
        add(optFemale);
        add(lblCountry);
        add(cboCountries);
        add(lblCourses);
        add(lstCourses);
        add(chkTnC);
        add(cmdSubmit);
        
        // Set the layout manager to FlowLayout for arranging components
        setLayout(new FlowLayout());
        
        // Set the size of the frame
        setSize(300, 400);
        
        // Make the frame visible
        setVisible(true);
    }
    
    // Main method to run the application
    public static void main(String args[])
    {
        new FirstApp();  // Create an instance of FirstApp which displays the GUI
    }
}