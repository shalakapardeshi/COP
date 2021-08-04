import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum,i;
		sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("the sum of the series is "+sum);
		sc.close();
	}

}
