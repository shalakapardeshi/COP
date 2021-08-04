import java.util.Scanner;

public class PrimeN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		Scanner sc= new Scanner(System.in);
		System.out.println("eneter the number");
		n=sc.nextInt();
		System.out.println("the prime numbers are");
		for(i=1;i<=n;i++)
		{

			for(j=2;j<=i;j++)
			{
				if(i%j==0) 
					break;
			}
			
			if (j==i)
			{
				System.out.println(+j);
			}
		}

		sc.close();
	}

}
