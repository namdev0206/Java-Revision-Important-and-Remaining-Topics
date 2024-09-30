import java.util.*;
import java.io.*;

class FileHandling5
{
	public static void main(String args[])
	{
		try
		{
			File newFile = new File("Nadev.java, File Handling, Example.txt"); //Path of the File
		
			Scanner scanner = new Scanner(file);
		
			while(scanner.hasNextLine()) //Doubt Line
			{
				String data = scanner.nextLine();
				System.out.println(data);
			}
			scanner.close();
		}
	
	
		catch(IOException e)
		{
			System.out.println("An Error is Occured");
			e.printStackTrace();
		}
	}
}