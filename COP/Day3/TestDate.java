
public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date dob = new Date();
		dob.acceptInfo();
		dob.displayDate();
		
		System.out.println("--------------------------------");
		Date d1= new Date();
		d1.setnewdate(11);
		d1.setnewMonth(5);
		d1.setnewYear(2021);
		d1.displayDate();
		System.out.println("------------------------------------");
		System.out.println("Day: "+d1.getnewdate());
		System.out.println("Month: "+d1.getnewMonth());
		System.out.println("Year: "+d1.getnewYear());
	}

}
