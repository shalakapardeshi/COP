import java.util.Scanner;

public class StringUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,size;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of string array");
		size= sc.nextInt();
		String arr[]=new String[size];
		System.out.println("Enter the names");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.next();

	}
System.out.println("Names converted to uppercase");
for(j=0;j<arr.length;j++)
{
	System.out.println( arr[j].toUpperCase());
}

}
}
