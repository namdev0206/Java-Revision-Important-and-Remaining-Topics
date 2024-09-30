//Student Marksheet

import java.util.*;

class Student
{
	String name;
	int physics;
	int chemistry;
	int maths;
	int english;
	int hindi;
	
	Scanner input = new Scanner(System.in);
	int avg;
	int sum;
	
	void setData()
	{
		System.out.println("Enter Name of Student	: ");
		name = input.next();
		
		System.out.println("Enter Physics Marks		: ");
		physics = input.nextInt();
		
		System.out.println("Enter Chemistry Marks	: ");
		chemistry = input.nextInt();
		
		System.out.println("Enter Maths Marks		: ");
		maths = input.nextInt();
		
		System.out.println("Enter English Marks		: ");
		english = input.nextInt();
		
		System.out.println("Enter Hindi Marks		: ");
		hindi = input.nextInt();
	}
	
	
	void average()
	{
		avg = ((physics + chemistry + maths + english + hindi) / 5);
		System.out.println("Average Marks of Student is = " + avg);
	}
	
	void marSum()
	{
		sum = (physics + chemistry + maths + english + hindi);
		System.out.println("Sum of all Marks of Student is = " + avg);
	}
	
	void result()
	{
		if(sum >= 250)
		{
			System.out.println("Student is Fail with " + sum + " Marks");
		}
		else
		{
			System.out.println("Student is Fail with " + sum + " Marks");
			System.out.println("Student is Fail with " + sum + " Marks");
			System.out.println("Student is Fail with " + sum + " Marks");
			System.out.println("Student is Fail with " + sum + " Marks");
			System.out.println("Student is Fail with " + sum + " Marks");
			System.out.println("Student is Fail with " + sum + " Marks");
			System.out.println("Student is Fail with " + sum + " Marks");
		}
	}
	
	void display()
	{
		System.out.println("\nStudent Details are Given Below :\n");
		System.out.println("Student name is					: " + name);
		System.out.println("Student's Maths marks are		: " + maths);
		System.out.println("Student's Chemistry marks are	: " + chemistry);
		System.out.println("Student's Physics marks are		: " + physics);
		System.out.println("Student's English marks are		: " + english);
		System.out.println("Student's Hindi marks are		: " + hindi);
	}
}


//Main
class Marksheet
{
	public static void main(String args[])
	{
		Student k[] = new Student[5];
		
		//To input of Details
		for(int i = 0; i < 5; i++)
		{
			k[i] = new Student();
			System.out.println("Enter Details for " + (i+i) + " Students\n");
			k[i].setData();
			System.out.println("\n");
		}
		
		//To Print the Details
		for(int i = 0; i < 5; i++)
		{
			k[i].marSum();
			k[i].average();
			k[i].result();
			k[i].display();
		}
	}
}