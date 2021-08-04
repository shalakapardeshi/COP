import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,reverse,remainder,a;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		a=n;
		reverse=0;
		while(n!=0)
		{
			remainder=n%10;
			reverse=reverse*10+remainder;
			n=n/10;
		}
if(a==reverse)
	System.out.println("the number is palindrome number");
else
	System.out.println("the number is not a palindrome number");
sc.close();
	}

}
