import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the elements in the array");
int i,j;
int []arr= new int[5];
Scanner sc= new Scanner(System.in);
for(i=0;i<arr.length;i++)
{
	arr[i]=sc.nextInt();
}
System.out.println("Reverse of array is");
for(j=arr.length-1;j>=0;j--) {
	System.out.println(arr[j]);
}
sc.close();
	}

}
