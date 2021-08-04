import java.util.Scanner;

public class DisplayArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the array element");
		int[] arrs=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arrs.length;i++)
		{
			arrs[i]=sc.nextInt();
			
		}
		System.out.println("array is");
		for(int i=0;i<arrs.length;i++)
		{
			System.out.println(arrs[i]);
		}	
	sc.close();	
	
	}
}
