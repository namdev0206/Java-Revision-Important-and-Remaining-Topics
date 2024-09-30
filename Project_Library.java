import java.util.Scanner;

class Library
{
	int bookNo;
	String bookName;
	String author;
	String publisher;
	int price;
	int copyIssued;
	int copyNo;
	
	//Constructor
	Library(int BookNo, String BookName, String Author, String Publisher, int price, int copyIssued, int copyNo)
	{
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.copyIssued = copyIssued;
		this.copyNo = copyNo;	
	}
	
	//Input for the Initial Value
	void initial()
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the Book No. ");
		bookNo = input.nextInt();
		
		System.out.print("Enter the Book No. ");
		bookName = input.nextInt();
		
		System.out.print("Enter the Book No. ");
		author = input.nextInt();
		
		System.out.print("Enter the Book No. ");
		publisher = input.nextInt();
		
		System.out.print("Enter the Book No. ");
		price = input.nextInt();
		
		System.out.print("Enter the Book No. ");
		copyIssued = input.nextInt();
		
		System.out.print("Enter the Book No. ");
		copyNo = input.nextInt();
	}
	
	
	void display()
	{
		System.out.print();
	}
	
	
}

//Main
class Library
{
	public static void main(String args[])
	{
		//Define a New Object for Library
		Library stu = new Library();
		
	}
}