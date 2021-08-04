import java.util.Scanner;

public class AdditionNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,ans,ansd;
		char ch1,ch2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		num1= sc.nextInt();
		System.out.println("enter the second number");
		num2= sc.nextInt();
		System.out.println("enter the first character");
		ch1= sc.next().charAt(0);
		System.out.println("enter the second character");
		ch2= sc.next().charAt(0);
		ans=num1+num2;
		ansd=ch1+ch2;
		System.out.println("the addition of two number is "+ans);
		System.out.println("the addition of character is "+ansd);
		System.out.println("the two characters are "+ch1+ch2);
		sc.close();
	}

}
