import java.util.Scanner;

public class SumEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,sumeven,sumodd;
		sumeven=0;
		sumodd=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		for (i=1;i<=n;i++)
		{
		if(i%2==0)
			sumeven+=i;
		else
			sumodd+=i;
		}
		System.out.println("the addition of even numbers is "+sumeven);
		System.out.println("the addition of even numbers is "+sumodd);
		sc.close();
	}

}
