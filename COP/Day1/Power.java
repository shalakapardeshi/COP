import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base,exponent,num;
		num=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the base value");
		base=sc.nextInt();
		System.out.println("enter the exponent value");
		exponent=sc.nextInt();
		while(exponent!=0)
		{
			num=base*num;
			exponent--;
			
		}
		
System.out.println("the number is "+num);
sc.close();

	}

}
