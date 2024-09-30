//File Handling -  To copy one File Data into Another File

import java.io.*;

class FileCopy1
{
	public static void main(String args[])
	{
		try
		{
			//To Read a new File 
			FileReader fr=new FileReader("FileCopy.java");
			
			if(fr!=null)
			{
				 FileWriter fw=new FileWriter("newfile.java");
				 if(fw!=null)
				 {
						while(true)
						{
							int p=fr.read();
							if(p==-1)
							{break;}
							else
							{
							   char p1=(char)p;
							   fw.write(p1);
							}
						}
				 }
			}
		}
		
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
