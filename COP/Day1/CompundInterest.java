
public class CompundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount,year,rate;
		double interest;
		float a;
		amount=20000;
		year=3;
		rate=6;
	  interest = amount * (Math.pow((1 + rate/100), (year))) - amount;
		System.out.println("the compound interest is"+interest);
	}

}
