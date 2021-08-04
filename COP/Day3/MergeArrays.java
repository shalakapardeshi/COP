import java.util.Scanner;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1= {12,13,44};
		int []arr2= {44,45,47,50};
		int i,j;
		int count=0;
		
		int []merge=new int[arr1.length+arr2.length];
		for(i=0;i<arr1.length;i++)
		{
			merge[i]=arr1[i];
			count++;
		}
			for(i=0;i<arr2.length;i++)
			{
				merge[count++]=arr2[i];
				
				
			}
			for(i=0;i<merge.length;i++)
			{
				System.out.println("  " +merge[i]);
			}
		

	}

}
