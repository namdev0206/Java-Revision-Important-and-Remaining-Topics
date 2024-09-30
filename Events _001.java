//GUI - Events

import java.awt.*;  //Abstract Window Toolkit
import javax.swing.*;
import java.awt.event.*;  //To Perform an event


//ActionListener is an Interface - implements is used
class Gui implements ActionListener
{
	//Defined for Frame
	Frame frame = new Frame();
	
	//Label is a Class to add the Input in GUI
	Label l1 = new Label("First Number");
	Label l2 = new Label("Second Number");
	Label l3 = new Label("Result");
	
	//TextField is a pre defined class that is used to add input field in GUI
	//t1 is a name that is used to call
	//20 is used to visible the 20 inputs Number
	TextField t1 = new TextField(20);
	TextField t2 = new TextField(20);
	TextField t3 = new TextField(20);
	
	//Button is a Pre-Defined Class that is used to add the Button in GUI
	Button btn1 = new Button("+");
	Button btn2 = new Button("-");
	Button btn3 = new Button("Clear");
	
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
		frame.addWindowListener(new Raju());
		frame.addMouseMotionListener(new Komal());
		frame.addMouseListener(new Nik());
		
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
		frame.setSize(500, 300);
		
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
	
	class Raju implements WindowListener 
	{
		public void windowDeactivated(WindowEvent e) 
		{
			System.out.println("Window Deactivated");
		}
		public void  windowActivated(WindowEvent e)
		{
			System.out.println("Window Activated");
		}
		public void windowDeiconified(WindowEvent e)
		{
			System.out.println("Window Deiconified");
		}
		public void windowIconified(WindowEvent e)
		{
			System.out.println("Window Iconified");
		}
			public void windowClosed(WindowEvent e)
		{
			System.out.println("Window Closed");
		}
		public void windowClosing(WindowEvent e)
		{
			System.out.println("Window Closing");
			System.exit(0);
		}
		public void windowOpened(WindowEvent e)
		{
			System.out.println("Window Opened");
		}
	}
	
	class Komal implements MouseMotionListener
	{
		public void mouseMoved(MouseEvent e)
		{
			System.out.println("Mouse Moved");
		}	
		
		public void mouseDragged(MouseEvent e)
		{
			System.out.println("Mouse Dragged");
		}			
	}
	
	class Nik implements MouseListener
	{
		public void mouseExited(MouseEvent e)
		{
			System.out.println("Mouse Exited");
		}
		
		public void  mouseEntered(MouseEvent e)
		{
			System.out.println("Mouse Entered");
		}
		
		public void mouseReleased(MouseEvent e)
		{
			System.out.println("Mouse Released");
		}
		
		public void mousePressed(MouseEvent e)
		{
			System.out.println("Mouse Pressed");
		}
		
		public void mouseClicked(MouseEvent e)
		{
			System.out.println("Mouse Clicked");
		}
	}
}


//Main Class
class Events
{
	public static void main(String args[])
	{
		Gui k = new Gui();
		k.data();
	}
}
