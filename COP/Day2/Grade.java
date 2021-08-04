import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int RollNo,phy,math,chem,eng,bio;
		double total,percentage;
		String Name,grade;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the roll no");
		RollNo= sc.nextInt();
		System.out.println("enter the name of the student");
		Name=sc.next();
		System.out.println("enter the marks of physics ");
		phy=sc.nextInt();
		System.out.println("enter the marks of maths ");
		math=sc.nextInt();
		System.out.println("enter the marks of chemistry ");
		chem=sc.nextInt();
		System.out.println("enter the marks of english ");
		eng=sc.nextInt();
		System.out.println("enter the marks of bio ");
		bio=sc.nextInt();
		total=phy+math+chem+eng+bio;
		percentage= total/500*100;
		System.out.println("the total marks are "+total);
		System.out.println("the percentage is "+percentage);
		if(percentage>75)
			System.out.println("the grade is A");
		else if (percentage<74 && percentage > 60)
			System.out.println("the grade is B");
		else
		System.out.println("the grade is C");
		sc.close();


	}

}
