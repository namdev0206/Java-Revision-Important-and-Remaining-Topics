//File Handling - Create New File

import java.util.*;
import java.io.*;

class FileHandling3
{
	public static void main(String args[])
	{
		try
		{
			FileWriter file = new FileWriter("Example.txt");
			
			if(file.createNewFile())
			{
				System.out.println("File Created");
			}
			else
			{
				System.out.println("File Already Exists.");
			}
		}
		
		catch(IOException ex)
		{
			System.out.println("An Error Occured.");
			ex.printStackTrace();
		}
	}
}