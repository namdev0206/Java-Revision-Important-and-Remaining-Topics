//File Handling - To Delete the Existing File.

import java.util.*;
import java.io.*;

class FileHandling6
{
	public static void main(String args[])
	{
		File newFile = new File("Example2.txt");
		
		if(newFile.delete())
		{
			System.out.println("The File is Deleted");
		}
		else
		{
			System.out.println("File is not Deleted");
		}
	}
}