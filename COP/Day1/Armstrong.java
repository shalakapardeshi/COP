import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,rem,sum,a,b;
		sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		b=n;
		while(n!=0)
		{
			rem=n%10;
			a=rem*rem*rem;
			sum+=a;
			n=n/10;
		}
		if(b==sum)
			System.out.println("the number is armstrong number");
		else
			System.out.println("the number is not a armstrong number");
		sc.close();
	}

}
