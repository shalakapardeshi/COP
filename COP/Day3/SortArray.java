import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int size,i,j,temp;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the size of the array");
size=sc.nextInt();
int []arr=new int[size];
System.out.println("Enter the elements of the array");
for(i=0;i<arr.length;i++)
{
	arr[i]=sc.nextInt();
}
System.out.println("---------------------------------------------------");
System.out.println("Sorted Array");
for(i=0;i<arr.length;i++)
{
	for(j=i+1;j<arr.length;j++)
	{
		if(arr[i]>arr[j])
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
for(i=0;i<arr.length;i++)
{
	System.out.println(" "+arr[i]);
}
	sc.close();
	}

}
