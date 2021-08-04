import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Customer cust1= new Customer();
cust1.AcceptInfo();
cust1.DisplayInfo();

System.out.println("----------------------------------------");
Customer cust2=new Customer();
cust2.AcceptInfo();
cust2.DisplayInfo();
System.out.println("Enter New CreditLimit");
Scanner sc=new Scanner(System.in);
double c=sc.nextDouble();
cust2.setCreditLimit(c);
System.out.println("New credit limit is "+cust2.getCreditLimit());


		
	}

}
