import java.util.Scanner;

public class Customer {
	private String name;
	private String emailId;
	private int age;
	private double creditLimit;
	void AcceptInfo()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name");
		name=sc.next();
		System.out.println("Enter the email id");
		emailId=sc.next();
		System.out.println("Enter the age");
		age=sc.nextInt();
		System.out.println("Enter the credit limit");
		creditLimit=sc.nextDouble();
		
	}
	public void setCreditLimit(double newCredit)
	{
		
		creditLimit=newCredit;
	}
	public double getCreditLimit()
	{
		return creditLimit;
	}
	void DisplayInfo()
	{
		System.out.println("The customer details are");
		System.out.println("Nmae: "+name +" creditlimit: "+creditLimit);
	}

}


