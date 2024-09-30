//GUI

import java.awt.*;  //Abstract Window Toolkit
import javax.swing.*;
import java.awt.event.*;  //To Perform an event


//ActionListener is an Interface - implements is used
class Gui implements ActionListener
{
	//Defined for Frame
	JFrame frame = new JFrame();
	
	//Label is a Class to add the Input in GUI
	JLabel l1 = new JLabel("First Number");
	JLabel l2 = new JLabel("Second Number");
	JLabel l3 = new JLabel("Result");
	
	//TextField is a pre defined class that is used to add input field in GUI
	//t1 is a name that is used to call
	//20 is used to visible the 20 inputs Number
	JTextField t1 = new JTextField(20);
	JTextField t2 = new JTextField(20);
	JTextField t3 = new JTextField(20);
	
	//Button is a Pre-Defined Class that is used to add the Button in GUI
	JButton btn1 = new JButton("+");
	JButton btn2 = new JButton("-");
	JButton btn3 = new JButton("Clear");
	
	void data()
	{
		//setBounds is a Pre-Defined Class is Used to set the Dimensions of GUI
		l1.setBounds(50, 50, 100, 30);
		t1.setBounds(160, 50, 100, 30);
		l2.setBounds(50, 100, 100, 30);
		t2.setBounds(160, 100, 100, 30);
		l3.setBounds(50, 150, 100, 30);
		t3.setBounds(160, 150, 100, 30);
		btn1.setBounds(50, 200, 50, 30);
		btn2.setBounds(110, 200, 50, 30);
		btn3.setBounds(170, 200, 50, 30);
		
		//Frame is a pre Defined Class
		frame.add(l1);
		frame.add(t1);
		frame.add(l2);
		frame.add(t2);
		frame.add(l3);
		frame.add(t3);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		
		//ActionListener is used to add Behaviour after Clicking a Button
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		//setLayout to add Location of Button and every Text Field
		frame.setLayout(null);
		
		//To add the Title on Frame
		frame.setTitle("Calculator");
		
		//To set the Location of Frame in CMD 
		frame.setLocation(400, 200);
		
		//To set the Dimensions of Frame
		frame.setSize(400, 400);
		
		//To Visible the Frame
		frame.setVisible(true);
	}
	
	//actionPerformed is a pre Defined Method
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btn1)
		{
			//To convert the String into Integer
			int a = Integer.parseInt(t1.getText());
			int b = Integer.parseInt(t2.getText());
			int c = a + b;
			t3.setText(" " + c);
		}
		else if(e.getSource() == btn2)
		{
			//To convert the String into Integer
			int a = Integer.parseInt(t1.getText());
			int b = Integer.parseInt(t2.getText());
			int c = a - b;
			t3.setText(" " + c);
		}
		else if(e.getSource() == btn3)
		{
			t1.setText(" ");
			t2.setText(" ");
			t3.setText(" ");
		}
	}
}


//Main Class
class CalciSwing
{
	public static void main(String args[])
	{
		Gui k = new Gui();
		k.data();
	}
}
