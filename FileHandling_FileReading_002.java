//File Reading - To read the Exsisting file

import java.io.*;

class FileReading2
{
	public static void main(String args[])
	{
		try
		{
			FileReader fr = new FileReader("Nikhil2.txt");
			
			if(fr != null)
			{
				while(true)
				{
					int p = fr.read();
					if(p == -1)
					{
						break;
					}
					else
					{
						System.out.print((char)p);
					}
				}
			}
			else
			{
				System.out.println("File is not Found.");	
			}
		}
		
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
	}
}