//File Handling - Create File and add TExt in File

import java.io.*;

class FileHandling2
{
	public static void main(String args[])
	{
		try
		{
			//File Writer is a Class
			//To Create a new File
			FileWriter fw = new FileWriter("Nikhil2.txt");
			
			if(fw != null)
			{
				//Add Text in File
				String m = "My Name is Nikhil.";
				fw.write(m);
				System.out.println("File Saved");
				
				//Closing of a File after Written in a file
				fw.close();
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