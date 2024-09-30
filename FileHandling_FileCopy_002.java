//File Handling -  To copy one File Data into Another File

import java.io.*;

class FileCopy
{
	public static void main(String args[])
	{
		try
		{
			//To Read a new File
			FileReader nf = new FileReader("Nikhil2.txt");
			
			if(nf != null)
			{
				//To Create or Write in a New File
				FileWriter sf = new FileWriter("Nikhil2Copied.txt");
				
				if(sf != null)
				{
					while(true)
					{
						int newFile = nf.read();
						
						if(newFile == -1)
						{
							break;
						}
						else
						{
							char newFile2 = ((char)newFile);
							sf.write(newFile2);
						}
					}
					sf.close();
				}
			}
		}
		
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
