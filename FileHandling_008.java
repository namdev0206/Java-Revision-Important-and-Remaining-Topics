//File Handling - To Check the file is Existed or Not

import java.util.*;
import java.io.*;

class FileHandling7
{
	public static void main(String args[])
	{
		File newFile = new File("Example.txt");
		
		if(newFile.exists())
		{
			System.out.println("File Exist.");
		}
		else
		{
			System.out.println("File does not Exist");
		}
	}
}