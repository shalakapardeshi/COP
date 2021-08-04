import java.util.Scanner;

public class Employee {
	private int empId;
	private String name;
	private double basicSal; 
	private double hra; 
	private double medical;
	private double pf; 
	private final double PT=200;
	private double netSalary;
	private double grossSalary;
void acceptInfo()
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the employee ID");
	empId=sc.nextInt();
	System.out.println("Enter the name of employee");
	name=sc.next();
	System.out.println("Enter the basic salary of an employee");
	basicSal=sc.nextDouble();
	System.out.println("enter the medical expenses");
	medical=sc.nextDouble();
	
}
void displayInfo()
{
	hra=50*basicSal/100;
	pf=12*basicSal/100;
	grossSalary=basicSal+hra+medical;
	netSalary= grossSalary-(PT+pf);
	System.out.println("The employee ID of employee: "+empId);
	System.out.println("The name of the employee: "+name);
	System.out.println("The basic salary of an employee: "+basicSal);
	System.out.println("The gross salary of an employee: "+grossSalary);
	System.out.println("The net salary of an employee: "+netSalary);
}
}


