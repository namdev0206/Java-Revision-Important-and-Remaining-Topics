//File Handling - Create a File

import java.io.*;

class FileHandling
{
	public static void main(String args[])
	{
		try
		{
			//File Writer is a Class
			FileWriter fw = new FileWriter("Nikhil.txt");
			
			if(fw != null)
			{
				System.out.println("File is Created.");
			}
			else
			{
				System.out.println("File is not Created.");
			}
		}
		
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
	}
}