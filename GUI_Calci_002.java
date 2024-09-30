import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Gui implements ActionListener
{
    Frame frame = new Frame();
    
    Label l1 = new Label("First Number");
    Label l2 = new Label("Second Number");
    Label l3 = new Label("Result");
    
    TextField t1 = new TextField(20);
    TextField t2 = new TextField(20);
    TextField t3 = new TextField(20);
    
    Button btn1 = new Button("+");
    Button btn2 = new Button("-");
    Button btn3 = new Button("*");
    Button btn4 = new Button("/");
    Button btn5 = new Button("Clear");
    
    void data()
    {
        l1.setBounds(50, 50, 100, 30);
        t1.setBounds(160, 50, 100, 30);
        l2.setBounds(50, 100, 100, 30);
        t2.setBounds(160, 100, 100, 30);
        l3.setBounds(50, 150, 100, 30);
        t3.setBounds(160, 150, 100, 30);
        btn1.setBounds(50, 200, 50, 30);
        btn2.setBounds(110, 200, 50, 30);
        btn3.setBounds(170, 200, 50, 30);
        btn4.setBounds(230, 200, 50, 30);
        btn5.setBounds(290, 200, 50, 30);
        
        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(l3);
        frame.add(t3);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        
        frame.setLayout(null);
        
        frame.setTitle("Calculator");
        
        frame.setLocation(400, 200);
        
        frame.setSize(360, 400); // Phone screen size
        
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btn1)
        {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a + b;
            t3.setText(" " + c);
        }
        else if(e.getSource() == btn2)
        {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a - b;
            t3.setText(" " + c);
        }
        else if(e.getSource() == btn3)
        {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a * b;
            t3.setText(" " + c);
        }
        else if(e.getSource() == btn4)
        {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            if(b != 0)
            {
                double c = (double)a / b;
                t3.setText(" " + c);
            }
            else
            {
                t3.setText(" Error: Division by zero");
            }
        }
        else if(e.getSource() == btn5)
        {
            t1.setText(" ");
            t2.setText(" ");
            t3.setText(" ");
        }
    }
}

class Calci2
{
    public static void main(String args[])
    {
        Gui k = new Gui();
        k.data();
    }
}