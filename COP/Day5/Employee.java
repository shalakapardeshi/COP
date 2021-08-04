
import java.util.Scanner;

public class Employee {
	
	private int empid;
	private String name;
	private String add;
	private double salary;
	
	
	
	public Employee (int id,String nm,String addr,double sal)
	{
		empid=id;
		name=nm;
		add=addr;
		salary=sal;
	}
	public Employee(int salary)
	{
		this.salary=salary;
	}
	public void setId(int idd)
	{
		empid=idd;
	}
	public int getId()
	{
		return empid;	}
	 public void setName(String Name){
		    name = Name;
		  }
	  public String getName(){
		    return name;
		  }
	  public void setSal(double sal){
		    salary = sal;
		  }
		  public double getSal(){
		    return salary;
		  }
		  public void setAdrs(String Adrs){
			    add = Adrs;
			  }
		  public String getAdrs(){
		    return add;
		  }
		 
	public void displayInfo()
	{
		
		System.out.println("EmpId:"+empid);
		System.out.println("Name:"+name);
		System.out.println("Address:"+add);
		System.out.println("Salary:"+salary);
		
	}
	

}
