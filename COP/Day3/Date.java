import java.util.Scanner;

public class Date {

	private int date;
	private int month;
	private int year;
	void acceptInfo()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the date");
		date=sc.nextInt();
		System.out.println("Enter the month");
		month=sc.nextInt();
		System.out.println("Enter the year");
		year=sc.nextInt();
	}
	public void setnewdate(int date1)
	{
		date=date1;
	}
	public int getnewdate()
	{
		return date;
	}
	public void setnewMonth(int month1)
	{
		month=month1;
	}
	public int getnewMonth()
	{
		return month;
	}
	public void setnewYear(int year1)
	{
		year=year1;
	}
	public int getnewYear()
	{
		return year;
	}
	public void displayDate()
	{
		System.out.println("Date:" +date+"/"+month+"/"+year);
	}
	
	
	
}
