//Import Package
//Import the Custom Library made by User
import lib.exp.sahil.MyPack1;

//Import the Already made Library made by System
import java.util.Scanner; 


//Main Class
class Package1 
{
	
	public static void main(String args[])
	{
		//Define an Object for Method made in Library
		MyPack1 k = new MyPack1();
		
		//Calling of a Method made in User Made Library
		k.mul(2, 8);
	}
}
