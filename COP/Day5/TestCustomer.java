import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------------------------------");
		Scanner sc= new Scanner(System.in);
		System.out.println("Name EmailId Age CreditLimit");
		String nm = sc.next();
		String emailid = sc.next();
		int agee = sc.nextInt();
		double creditLmt = sc.nextDouble();
		System.out.println(" First Customer");
		
		Customer c1= new Customer();
		c1.displayinfo();
		System.out.println("-------------------------------------------");
		System.out.println("Second Customer");
		Customer c2= new Customer(nm,emailid,agee,creditLmt);
		c2.displayinfo();
		c2.setCreditLimit(50000);
		System.out.println("New credit limit for second customer is "+c2.getCreditLimit());

	}

}
