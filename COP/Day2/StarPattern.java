import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,a;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many rows you want to print");
		a=sc.nextInt();
		System.out.println("       ");
		System.out.println("The Pattern");
		for(i=0;i<=5;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println("");
		}
		
		sc.close();
	}

}
