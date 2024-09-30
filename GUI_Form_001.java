//GUI

import java.awt.*;  //Abstract Window Toolkit
import javax.swing.*;
import java.awt.event.*;  //To Perform an event

class Form extends Frame
{
	Label lblTitle, lblFirstName, lblLastName, lblEmail, lblMobile;
	Label lblGender, lblPassword, lblConfirmPassword, lblDOB;
	
	TextField txtFirstName, txtLastName, txtEmail, txtMobile, txtPassword, txtConfirmPassword;
	Checkbox optMale, optFemale;
	CheckboxGroup gender;
	List lstMoCode, lstDate, lstMonth, lstYear;
	Button cmdSubmit;
	
	public Form()
	{
		lblTitle = new Label("Registration Form");
		lblFirstName = new Label("First Name");
		lblLastName = new Label("Last Name");
		lblEmail = new Label("Email ID");
		lblMobile = new Label("Mobile No");
		lblDOB = new Label("Date of Birth");
		lblGender = new Label("Gender");
		lblPassword = new Label("Password");
		lblConfirmPassword = new Label("Confirm Password");
		
		txtFirstName = new TextField(15);
		txtLastName = new TextField(15);
		txtEmail = new TextField(15);
		txtMobile = new TextField(15);
		
		txtPassword = new TextField(15);
		txtPassword.setEchoChar('*');
		
		txtConfirmPassword = new TextField(15);
		txtConfirmPassword.setEchoChar('*');
		
		gender = new CheckboxGroup();
		optMale = new Checkbox("Male" , gender, true); // Doubt
		optFemale = new Checkbox("Female" , gender, false);
		
		lstMoCode = new List(4 , true);
		lstMoCode.add("+91");
		lstMoCode.add("+92");
		lstMoCode.add("+1");
		lstMoCode.add("+2");
		lstMoCode.add("+93");
		lstMoCode.add("+94");
		
		lstDate = new List(5, true);
		lstDate.add("1");
		lstDate.add("2");
		lstDate.add("3");
		lstDate.add("4");
		lstDate.add("5");
		lstDate.add("6");
		lstDate.add("7");
		lstDate.add("8");
		lstDate.add("9");
		lstDate.add("10");
		lstDate.add("11");
		lstDate.add("12");
		lstDate.add("13");
		lstDate.add("14");
		lstDate.add("15");
		lstDate.add("16");
		lstDate.add("17");
		lstDate.add("18");
		lstDate.add("19");
		lstDate.add("20");
		lstDate.add("21");
		lstDate.add("22");
		lstDate.add("23");
		lstDate.add("24");
		lstDate.add("25");
		lstDate.add("26");
		lstDate.add("27");
		lstDate.add("28");
		lstDate.add("29");
		lstDate.add("30");
		lstDate.add("31");
			
		lstMonth = new List(5, true);
		lstMonth.add("January");
		lstMonth.add("February");
		lstMonth.add("March");
		lstMonth.add("April");
		lstMonth.add("May");
		lstMonth.add("June");
		lstMonth.add("July");
		lstMonth.add("August");
		lstMonth.add("September");
		lstMonth.add("October");
		lstMonth.add("November");
		lstMonth.add("Devember");
		
		lstYear = new List(5, true);
		lstYear.add("1990");
		lstYear.add("1991");
		lstYear.add("1992");
		lstYear.add("1993");
		lstYear.add("1994");
		lstYear.add("1995");
		lstYear.add("1996");
		lstYear.add("1997");
		lstYear.add("1998");
		lstYear.add("1999");
		lstYear.add("2000");
		lstYear.add("2001");
		lstYear.add("2002");
		lstYear.add("2003");
		lstYear.add("2004");
		lstYear.add("2005");
		
		//setBounds is a Pre-Defined Class is Used to set the Dimensions of GUI
		lblTitle.setBounds(50, 50, 100, 30);
		lblFirstName.setBounds(50, 50, 100, 30);
		txtFirstName.setBounds(160, 50, 100, 30);
		lblLastName.setBounds(50, 100, 100, 30);
		txtLastName.setBounds(160, 100, 100, 30);
		lblEmail.setBounds(50, 150, 100, 30);
		txtEmail.setBounds(160, 150, 100, 30);
		lblMobile.setBounds(50, 200, 50, 30);
		lstMoCode.setBounds(110, 200, 50, 30);
		txtMobile.setBounds(170, 200, 50, 30);
		lblGender.setBounds(170, 200, 50, 30);
		optMale.setBounds(170, 200, 50, 30);
		optFemale.setBounds(170, 200, 50, 30);
		lblDOB.setBounds(170, 200, 50, 30);
		lstDate.setBounds(170, 200, 50, 30);
		lstMonth.setBounds(170, 200, 50, 30);
		lstYear.setBounds(170, 200, 50, 30);
		lblPassword.setBounds(170, 200, 50, 30);
		txtPassword.setBounds(50, 50, 100, 30);
		lblConfirmPassword.setBounds(170, 200, 50, 30);
		txtConfirmPassword.setBounds(170, 200, 50, 30);
		cmdSubmit.setBounds(170, 200, 50, 30);
		
		//Frame is a pre Defined Class
		add(lblTitle);
		add(lblFirstName);
		add(txtFirstName);
		add(lblLastName);
		add(txtLastName);
		add(lblEmail);
		add(txtEmail);
		add(lblMobile);
		add(lstMoCode);
		add(txtMobile);
		add(lblGender);
		add(optMale);
		add(optFemale);
		add(lblDOB);
		add(lstDate);
		add(lstMonth);
		add(lstYear);
		add(lblPassword);
		add(lblConfirmPassword);
		add(cmdSubmit);
		
		//Submit Button
		cmdSubmit = new Button("Submit");
		
		//Title of Frame
		setTitle("Registration Form");		
		setLocation(500, 300);
		setSize(600, 600);
		setVisible(true);
	}
	
	//Main
	public static void main(String args[])
	{
		new Form();
	}	
}