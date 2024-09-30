//File Handling - To check the File is Exsisted or Not

import java.io.*;

class FileReading
{
	public static void main(String args[])
	{
		try
		{
			//FileREader is a Class
			FileReader fr = new FileReader("Nikhil2.txt");
		
			if(fr != null)
			{
				System.out.println("File is Found");
			}
			else
			{
				System.out.println("File is not Found");
			}
		}
		
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
		
}