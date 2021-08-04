import java.util.Scanner;

public class DateDisplay {
	private int date;
	private String month;
	private int year;
	
	void AcceptInfo()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the date");
		date=sc.nextInt();
		System.out.println("Enter the month");
		month=sc.next();
		System.out.println("Enter the year");
		year=sc.nextInt();
	}	
	void DisplayInfo()
	{
		System.out.println(" "+date +" "+month +" "+year);
	}

}

