//File Handling -  To copy one File Data into Another File

import java.io.*;

class FileCopy
{
	public static void maiin(String args[])
	{
		try
		{
			//To Create a New File
			FileWriter nf = new FileWriter("Nikhil3.txt");
			
			//Create an Another New File
			FileWriter sf = new FileWriter("Nikhil3Copy.txt");
			
			if(nf != null)
			{
				String newFile = "This is a new File";
				nf.write(newFile);
				System.out.println("New file is Saved");
				nf.close();
			}
			else
			{