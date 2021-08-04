import java.util.Scanner;

public class AdditionTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]arr1=new int [2][2];
		int [][]arr2= new int[2][2];
		int i,j,k,l,m;
		System.out.print("Enter the Elements of 1st Array");
		Scanner sc= new Scanner(System.in);
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.print("Enter the Elements of 2st Array");
		for(k=0;k<2;k++)
		{
			for(l=0;l<2;l++)
			{
				arr2[k][l]=sc.nextInt();
			}
		}
		int [][]sum= new int[2][2];
		for (i=0;i<2;i++)
		{
			for(l=0;l<2;l++)
			{
				for(m=0;m<2;m++)
				{
					sum[i][l]=arr1[i][m]+arr2[m][l];
				}
			}
		}
		
	
		System.out.println("Addition");
		for(i=0;i<2;i++)
		{
			for(l=0;l<2;l++)
			{
				System.out.print(sum[i][l]+" ");
			}
			System.out.println(" ");
		}
		
	}

}
