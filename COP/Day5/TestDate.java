
public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dob = new Date(5, 2, 1996);
		dob.setYear(1990);
		dob.displayDate();
		
		System.out.println("---------------------------------------------------------");
		Date d1= new Date();
		d1.setDay(11);
		d1.setMonth(5);
		d1.setYear(2021);
		d1.displayDate();
		System.out.println("----------------------------------------------------------");
		System.out.println("Day: "+d1.getDay());
		System.out.println("Month: "+d1.getMonth());
		System.out.println("Year: "+d1.getYear());

	}

}
