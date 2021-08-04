import java.util.Scanner;

public class DisplayTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr=new int [4][4];
		int i,j;
		System.out.print("Enter the Elements");
		Scanner sc= new Scanner(System.in);
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The 2D Array");
		
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print(arr[i][j]+ " ");
				
			}
			System.out.println(" ");
		}
	}

}
