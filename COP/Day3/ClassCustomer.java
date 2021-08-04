import java.util.Scanner;

public class ClassCustomer {
	private  String name;
	private String email;
	private int age;
	
	public ClassCustomer(String name, String email, int age)
	{
	
		System.out.println("---- invoking parameterised constr----");
		this.name=name;
		this.email=email;
		this.age=age;
	}
	public ClassCustomer()
	{	
		System.out.println("----invoking default constr----");
	
	name="Riya";
	email="riya@gmail.com";
	age=25;
	
	
	}
	
	
	public void acceptinfo()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Name EmailId Age");
		name=sc.next();
		email=sc.next();
		age=sc.nextInt();
	}
	public void acceptinfo(String name, String email, int age)
	{
		this.name=name;
		this.email=email;
		this.age=age;
	}
	public void displayinfo()
	{
		System.out.println("Name: "+this.name +" Email-ID: "+this.email +" Age: "+this.age);
	}

}
