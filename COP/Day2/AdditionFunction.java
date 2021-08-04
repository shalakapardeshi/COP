import java.util.Scanner;

public class AdditionFunction {
public static void add(int a,int b) {
	int c= a+b;
	System.out.println("The addition is "+c);
	
}
public static void add(int a,double b) {
	double c=a+b;
	System.out.println("The addition is "+c);
	
}
public static void add(double a,float b, int c) {
	float d=(float) (a+b+c);
	System.out.println("The addition is "+d);
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		double c;
		float d;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		a=sc.nextInt();
		System.out.println("enter the number");
		b=sc.nextInt();
		System.out.println("enter the number");
		c=sc.nextDouble();
		System.out.println("enter the number");
		d=sc.nextFloat();
		add(a,b);
		add(a,c);
		add(c,d,b);
		sc.close();
		
		
		

	}

}
