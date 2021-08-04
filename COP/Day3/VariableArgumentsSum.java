
public class VariableArgumentsSum {
	public static void sum(int ...a)
	{
		System.out.println("Size of the array"+a.length);
		int i,sum=0;
		for(i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println("the sum of "+a.length+ " element is "+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(7,1,2,3,4,5,6);
	}

}
