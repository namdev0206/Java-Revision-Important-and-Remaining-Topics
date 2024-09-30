//File Handling - Write in an Existing

import java.util.*;
import java.io.*;

class FileHandling4
{
	public static void main(String args[])
	{
		try
		{ 
			//Create a New File
			FileWriter newFile = new FileWriter("Example.txt");
			
			newFile.write("Hello, World!");
			newFile.close();
			System.out.println("Data Written in the Example file");
		}
		
		catch(IOException ex)
		{
			System.out.println("An Error Occured.");
			ex.printStackTrace();
		}
	}
}