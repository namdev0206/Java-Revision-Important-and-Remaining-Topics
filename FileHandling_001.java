//File Handling

import java.io.*;
import java.util.*;
class Bank
{
	 
}
class File_handling_001
{
	  public static void main(String args[])
	  {
		  Scanner input = new Scanner(System.in);
		  
		  int ch=1;
		  int a,b,c,d;
		  
		  while(ch!=0)
		  {
			  System.out.println("Enter 1 for Insert = ");
			  
			  System.out.println("Enter 2 for Display All Account = ");
			  
			  System.out.println("Enter 3 for Deposit in Account = ");
			  
			  System.out.println("Enter 4 for Withdrawl  = ");
			  
			  System.out.println("Enter 0 for exit = ");
			  
			  System.out.println("Enter your choice");
			  ch=input.nextInt();
			  
			  //Switch Statement
			  switch(ch)
			  {
				case 1:
						System.out.println("Insert");
						break;
				  
				case 2:
						System.out.println("Display all Account");
						break;
						
				case 3:
						System.out.println("Deposit in Account");
						break;
						
				case 4:
						System.out.println("Withdrawl");
						break;
						
				case 0:
						System.out.println("Exit");
						break;
			  }
		  }
	  }
}