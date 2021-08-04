import java.util.Scanner;

public class MinMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size,i,min,max;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array");
		size=sc.nextInt();
		int []arr= new int[size];
		System.out.println("Enter the element of the array");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		min=arr[0];
		for(i=0;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
		}
		max=arr[0];
		for(i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("the minimum value of array is "+min);
		System.out.println("the maximum value of array is "+max);
	sc.close();
	}

}
