import java.util.Scanner;

public class IndexArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i,b;
		int flag= 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the array");
		size=sc.nextInt();
		System.out.println("enter the array element");
		int[] arr= new int[size];
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the element you want to check");
		b=sc.nextInt();
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==b)
				{
				flag= 1;
				break;
				}
			else
			{
				flag=0;
				
		}
		
	}
		if(flag==1)
		{
			System.out.println("the element present in array at index"+i);
		}
		else
		{
			System.out.println("the element not exist");
		}
		sc.close();
	}
}
