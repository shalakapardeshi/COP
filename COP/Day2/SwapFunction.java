import java.util.Scanner;

public class SwapFunction {
public static void  Swap(int a,int b){
	int temp;
	temp=a;
	a=b;
	b=temp;
	System.out.println("After Swapping");
	System.out.println(" " +a+ " "+b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the first number");
		num1=sc.nextInt();
		System.out.print("enete the second number");
		num2=sc.nextInt();
		System.out.println("Before Swapping");
		System.out.println(" " +num1+ " "+num2);
        Swap(num1,num2);
        sc.close();

	}

}
