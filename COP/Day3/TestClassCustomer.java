import java.util.Scanner;

public class TestClassCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Name Emailid Age");
		String nm=sc.next();
		String emid=sc.next();
		int Age=sc.nextInt();
		ClassCustomer C1= new ClassCustomer(nm,emid,Age);
		C1.displayinfo();
		
		ClassCustomer C2= new ClassCustomer();
		C2.displayinfo();
				

	}

}
