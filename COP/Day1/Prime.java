import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,count;
		count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
if(count>2)
	System.out.println("the number is not a prime number");
else
	System.out.println("the number is prime number");
sc.close();
	}

}
