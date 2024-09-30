//Java GUI Calculator

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Gui implements ActionListener
{
    JFrame frame = new JFrame();
    
    JTextField t1 = new JTextField(120);
    
	JButton btn01 = new JButton("1");
	JButton btn02 = new JButton("2");
	JButton btn03 = new JButton("3");
	JButton btn04 = new JButton("4");
	JButton btn05 = new JButton("5");
	JButton btn06 = new JButton("6");
	JButton btn07 = new JButton("7");
	JButton btn08 = new JButton("8");
	JButton btn09 = new JButton("9");
	JButton btn00 = new JButton("0");
    JButton btn1 = new JButton("+");
    JButton btn2 = new JButton("-");
    JButton btn3 = new JButton("*");
    JButton btn4 = new JButton("/");
    JButton btn5 = new JButton("=");
	
    String result = null;
	char ch = ' ';
	
    void data()
    {
        t1.setBounds(10, 40, 270, 130); //(290, 460)
		btn01.setBounds(20, 175, 70, 50);
		btn02.setBounds(110, 175, 70, 50);
		btn03.setBounds(200, 175, 70, 50);
		btn04.setBounds(20, 230, 70, 50);
		btn05.setBounds(110, 230, 70, 50);
		btn06.setBounds(200, 230, 70, 50);
		btn07.setBounds(20, 285, 70, 50);
		btn08.setBounds(110, 285, 70, 50);
		btn09.setBounds(200, 285, 70, 50);
		btn00.setBounds(20, 340, 70, 50);
        btn1.setBounds(110, 340, 70, 50);
        btn2.setBounds(200, 340, 70, 50);
        btn3.setBounds(20, 395, 70, 50);
        btn4.setBounds(110, 395, 70, 50);
        btn5.setBounds(200, 395, 70, 50);
        

        frame.add(t1);
		frame.add(btn01);
		frame.add(btn02);
		frame.add(btn03);
		frame.add(btn04);
		frame.add(btn05);
		frame.add(btn06);
		frame.add(btn07);
		frame.add(btn08);
		frame.add(btn09);
		frame.add(btn00);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        
		btn01.addActionListener(this);
		btn02.addActionListener(this);
		btn03.addActionListener(this);
		btn04.addActionListener(this);
		btn05.addActionListener(this);
		btn06.addActionListener(this);
		btn07.addActionListener(this);
		btn08.addActionListener(this);
		btn09.addActionListener(this);
		btn00.addActionListener(this);
		btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
      
        frame.setLayout(null);
        
        frame.setTitle("Calculator");
        
        frame.setLocation(300, 200);
        
        frame.setSize(305, 490); // Phone screen size
        
        frame.setVisible(true);
    }
	
    
		public void actionPerformed(ActionEvent e)
    {
		//Value Buttons
        if(e.getSource() == btn01)
        {
            if(t1.getText().length()==0)
			{
				t1.setText("1");
			}
			else{
				String data = t1.getText();
				data = data + 1;
				t1.setText(data);
			}
        }
		if(e.getSource() == btn02)
        {
            if(t1.getText().length()==0)
			{
				t1.setText("2");
			}
			else{
				String data = t1.getText();
				data=data+2;
				t1.setText(data);
			}
        }
		else if(e.getSource() == btn03)
        {
            if(t1.getText().length()==0)
			{
				t1.setText("3");
			}
			else{
				String data = t1.getText();
				data = data + 3;
				t1.setText(data);
			}
        }
		else if(e.getSource() == btn04)
        {
            if(t1.getText().length()==0)
			{
				t1.setText("4");
			}
			else{
				String data  = t1.getText();
				data = data + 4;
				t1.setText(data);
			}
        }
		else if(e.getSource() == btn05)
        {
            if(t1.getText().length()==0)
			{
				t1.setText("5");
			}
			else{
				String data = t1.getText();
				data = data + 5;
				t1.setText(data);
			}
        }
		else if(e.getSource() == btn06)
        {
            if(t1.getText().length()==0)
			{
				t1.setText("6");
			}
			else{
				String data = t1.getText();
				data = data + 6;
				t1.setText(data);
			}
        }
		else if(e.getSource() == btn07)
        {
            if(t1.getText().length()==0)
			{
				t1.setText("7");
			}
			else{
				String data = t1.getText();
				data = data + 7;
				t1.setText(data);
			}
        }
		else if(e.getSource() == btn08)
        {
            if(t1.getText().length()==0)
			{
				t1.setText("8");
			}
			else{
				String data = t1.getText();
				data = data + 8;
				t1.setText(data);
			}
        }
		else if(e.getSource() == btn09)
        {
            if(t1.getText().length()==0)
			{
				t1.setText("9");
			}
			else{
				String data = t1.getText();
				data = data + 9;
				t1.setText(data);
			}
        }
		else if(e.getSource() == btn00)
        {
            if(t1.getText().length()==0)
			{
				t1.setText("0");
			}
			else{
				String data = t1.getText();
				data = data + 0;
				t1.setText(data);
			}
		}	
		
		
		//Character Buttons
		else if(e.getSource() == btn1)
        {
			result = t1.getText();
			ch= '+';
			t1.setText("");  
        }
		else if(e.getSource() == btn2)
        {
			result = t1.getText();
			ch = '-';
			t1.setText("");
        }
		else if(e.getSource() == btn3)
        {
			result = t1.getText();
			ch = '*';
			t1.setText("");  
        }
		else if(e.getSource() == btn4)
        {
			result = t1.getText();
			ch = '/';
			t1.setText("");
        }
		else if(e.getSource() == btn5)
        {
			String r1 = t1.getText();
			int a = Integer.parseInt(result);
			int b = Integer.parseInt(r1);
			int c = 0;
			
			switch(ch)
			{
				case '+':
					c = a + b;
					result = "" + c;
					t1.setText(result);
					break;
				
				case '-':
					c = a - b;
					result = "" + c;
					t1.setText(result);
					break;
					
				case '*':
					c = a * b;
					result = "" + c;
					t1.setText(result);
					break;
					
				case '/':
					c = a / b;
					result = "" + c;
					t1.setText(result);
					break;
			}
        }
	}
}


//Main Class
class CalculatorApp
{
    public static void main(String args[])
    {
        Gui k = new Gui();
        k.data();
    }
}