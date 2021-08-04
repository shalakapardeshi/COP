import java.util.Scanner;

public class Customer {

	private String name;
	private String email;
	private int age;
	private double creditLimit;
	
	public Customer(String name, String email, int age,double creditLimit)
	{
	    this();
		System.out.println("---- invoking parameterised constr----");
		this.name=name;
		this.email=email;
		this.age=age;
		this.creditLimit=creditLimit;
	}
	public Customer()
	{	
		System.out.println("----invoking default constr----");
	
	name="Riya";
	email="riya@gmail.com";
	age=25;
	creditLimit=10000;
	
	}
	
	
	public void acceptinfo()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Name EmailId Age CreditLimit");
		name=sc.next();
		email=sc.next();
		age=sc.nextInt();
		creditLimit=sc.nextDouble();
	}
	public void acceptinfo(String name, String email, int age, double creditLimit)
	{
		this.name=name;
		this.email=email;
		this.age=age;
		this.creditLimit= creditLimit;
	}
	public void setCreditLimit(double limit)
	{
		this.creditLimit=limit;
	}
	public double getCreditLimit()
	{
		return creditLimit;
	}
	public void displayinfo()
	{
		System.out.println("Name: "+this.name + " creditLimit "+this.creditLimit);
	}

}
