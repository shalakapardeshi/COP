import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,fact;
		fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		while(n!=0)
		{
		fact*=n;
		n--;
			}
		System.out.println("the factorial of the number is "+fact);
		sc.close();
	}

}
