import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class GameRandom implements ActionListener
{
	  JButton o1=new JButton("8");
	  JButton o2=new JButton("2");
	  JButton o3=new JButton("3");
	  JButton o4=new JButton("6");
	  JButton o5=new JButton("4");
	  JButton o6=new JButton("7");
	  JButton o7=new JButton("");
	  JButton o8=new JButton("5");
	  JButton o9=new JButton("1");
	  JFrame jf=new JFrame("GAME");
	  
	  GameRandom()
	  {
		 
		  jf.add(o1);
		  jf.add(o2);
		  jf.add(o3);
		  jf.add(o4);
		  jf.add(o5);
		  jf.add(o6);
		  jf.add(o7);
		  jf.add(o8);
		  jf.add(o9);
		  o1.addActionListener(this);
		  o2.addActionListener(this);
		  o3.addActionListener(this);
		  o4.addActionListener(this);
		  o5.addActionListener(this);
		  o6.addActionListener(this);
		  o7.addActionListener(this);
		  o8.addActionListener(this);
		  o9.addActionListener(this);
		  
		  jf.setLayout(new GridLayout(3,3,5,6));
		  jf.setLocation(200,100);
		  jf.setSize(400,400);
		  jf.setVisible(true);
		  
		  
	  }
	  public void actionPerformed(ActionEvent e)
	  {
		   if(e.getSource()==o1)
		   {
			   String d=o1.getLabel();
			   if(o2.getLabel().equals(""))
			   {
				   o2.setLabel(d);
				   o1.setLabel("");
			   }
			   else if(o4.getLabel().equals(""))
			   {
				   o4.setLabel(d);
				   o1.setLabel("");
			   }
			   
		   }
		   else if(e.getSource()==o2)
		   {
			   String d=o2.getLabel();
			   if(o1.getLabel().equals(""))
			   {
				   o1.setLabel(d);
				   o2.setLabel("");
			   }
			   else if(o3.getLabel().equals(""))
			   {
				   o3.setLabel(d);
				   o2.setLabel("");
			   }
			   else if(o5.getLabel().equals(""))
			   {
				   o5.setLabel(d);
				   o2.setLabel("");
			   }
			   
		   }
		    else if(e.getSource()==o3)
		   {
			   String d=o3.getLabel();
			   if(o2.getLabel().equals(""))
			   {
				   o2.setLabel(d);
				   o3.setLabel("");
			   }
			   else if(o6.getLabel().equals(""))
			   {
				   o6.setLabel(d);
				   o3.setLabel("");
			   }
			   
			   
		   }
		    else if(e.getSource()==o4)
		   {
			   String d=o4.getLabel();
			   if(o1.getLabel().equals(""))
			   {
				   o1.setLabel(d);
				   o4.setLabel("");
			   }
			   else if(o5.getLabel().equals(""))
			   {
				   o5.setLabel(d);
				   o4.setLabel("");
			   }
			   else if(o7.getLabel().equals(""))
			   {
				   o7.setLabel(d);
				   o4.setLabel("");
			   }
			   
		   }
		    else if(e.getSource()==o5)
		   {
			   String d=o5.getLabel();
			   if(o2.getLabel().equals(""))
			   {
				   o2.setLabel(d);
				   o5.setLabel("");
			   }
			   else if(o4.getLabel().equals(""))
			   {
				   o4.setLabel(d);
				   o5.setLabel("");
			   }
			   else if(o6.getLabel().equals(""))
			   {
				   o6.setLabel(d);
				   o5.setLabel("");
			   }
			   else if(o8.getLabel().equals(""))
			   {
				   o8.setLabel(d);
				   o5.setLabel("");
			   }
			   
		   }
		    else if(e.getSource()==o6)
		   {
			   String d=o6.getLabel();
			   if(o3.getLabel().equals(""))
			   {
				   o3.setLabel(d);
				   o6.setLabel("");
			   }
			   else if(o5.getLabel().equals(""))
			   {
				   o5.setLabel(d);
				   o6.setLabel("");
			   }
			   else if(o9.getLabel().equals(""))
			   {
				   o9.setLabel(d);
				   o6.setLabel("");
			   }
			   
		   }
		     else if(e.getSource()==o7)
		   {
			   String d=o7.getLabel();
			   if(o4.getLabel().equals(""))
			   {
				   o4.setLabel(d);
				   o7.setLabel("");
			   }
			   else if(o8.getLabel().equals(""))
			   {
				   o8.setLabel(d);
				   o7.setLabel("");
			   }
			   
			   
		   }
		    else if(e.getSource()==o8)
		   {
			   String d=o8.getLabel();
			   if(o5.getLabel().equals(""))
			   {
				   o5.setLabel(d);
				   o8.setLabel("");
			   }
			   else if(o7.getLabel().equals(""))
			   {
				   o7.setLabel(d);
				   o8.setLabel("");
			   }
			    else if(o9.getLabel().equals(""))
			   {
				   o9.setLabel(d);
				   o8.setLabel("");
			   }
			   
			   
		   }
		     else if(e.getSource()==o9)
		   {
			   String d=o9.getLabel();
			   if(o8.getLabel().equals(""))
			   {
				   o8.setLabel(d);
				   o9.setLabel("");
			   }
			   else if(o6.getLabel().equals(""))
			   {
				   o6.setLabel(d);
				   o9.setLabel("");
			   }
			    
			   
		   }
		   
		   
		   
	  }
	  
}

class Game
{
	public static void main(String args[])
	{
		new GameRandom();
	}
}