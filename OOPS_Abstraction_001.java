/*
Abstract Rules
1 - We should declare a class abstract if we're creating a Abstract method in a Class.
2 - We can't Create an object for an Abstract Class or Method.
3 - We should extend/emplements the abstract class to Run.
4 - We should declare a body in child class of an Abstract Class.
*/


//First Abstract Type Class
abstract class Common
{
	private String name;
	private String email;
	private String mobile;
	
	public Common()
	{
		
	}
	
	public Common(String name, String email, String mobile)
	{
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String getMobile()
	{
		return mobile;
	}
}


//Vendor Class
class Vendor extends Common
{
	private int vcode;
	
	public Vendor
	(
		int vcode,
		String vname,
		String email,
		String mobile
	)
	{
		super(vname, email, mobile);
		this.vcode = vcode;
	}
	
	public int getVCode()
	{
		return vcode;
	}
}


//Employee Class
class Employee extends Common
{
	private int ecode;
	
	public Employee
	(
		int ecode,
		String ename,
		String email,
		String mobile
	)
	{
		super(ename, email, mobile);
		this.ecode = ecode;
	}
	
	public int getECode()
	{
		return ecode;
	}
}

//Customer lass
class Customer extends Common
{
	private int ccode;
	
	public Customer
	(
		int ccode,
		String cname,
		String email,
		String mobile
	)
	{
		super(cname, email, mobile);
		this.ccode = ccode;
	}
	
	public int getCCode()
	{
		return ccode;
	}
}


//Main
class Abstract
{
	public static void main(String args[])
	{
		//Define Object for Vendor Class
		Vendor v = new Vendor(456, "Namdev", "namdev22@gmail.com", "8130555359");
		
		System.out.println(v.getVCode());
		System.out.println(v.getName());
		System.out.println(v.getEmail());
		System.out.println(v.getMobile());
		
		//Define Object for Employee Class
		Employee v = new Employee(456, "Namdev", "namdev22@gmail.com", "8130555359");
		
		System.out.println(v.getVCode());
		System.out.println(v.getName());
		System.out.println(v.getEmail());
		System.out.println(v.getMobile());
		
		//Define Object for Customer Class
		Customer v = new Customer(456, "Namdev", "namdev22@gmail.com", "8130555359");
		
		System.out.println(v.getVCode());
		System.out.println(v.getName());
		System.out.println(v.getEmail());
		System.out.println(v.getMobile());
	}
}