//File Handling

import java.util.*;
import java.io.*;

class FileCopy2
{
    public static void main(String args[])
	{
		//Try
		try
		{
            // To Read a new File
            FileReader nf = new FileReader("Nikhil3.txt");

            if (nf != null)
			{
                // To Create or Write in a New File
                FileWriter sf = new FileWriter("Nikhil3Copied.txt");

                if (sf != null)
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
                            char newFile2 = ((char) newFile);
							// Modify to write "aditya" instead of Nikhil
                            
                        }
                    }
                    sf.close();
                }
            }
        }

		//Catch
		catch (Exception ex)
		{
			System.out.println(ex);
        }
    }
}
