import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,remainder,reverse;
		reverse=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		n= sc.nextInt();
		while(n!=0)
		{
			remainder=n%10;
			reverse=reverse*10+remainder;
			n=n/10;
		}
		System.out.println("the reverse number is "+reverse);
		sc.close();
	}

}
