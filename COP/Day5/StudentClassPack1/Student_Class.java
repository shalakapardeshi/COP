package StudentClassPack1;

import java.util.Scanner;

public class Student_Class {

	public int rollNo;
	public String name;
	private char grade;
	int totalMarks;
	private static  Scanner scan = new Scanner(System.in);
	
	public void accept() { 
		System.out.println("enter roll no");
		this.rollNo = scan.nextInt();
		scan.nextLine();
		System.out.println("enter name");
		this.name = scan.nextLine();
		System.out.println("enter grade");
		this.grade = scan.next().charAt(0);
		System.out.println("enter total marks");
		this.totalMarks = scan.nextInt();
	}
	public void display() {
		System.out.println("roll no " + rollNo + "\t" + "name is"+"\t"+name + " grade"+ grade + "\t" + "total marsk " + totalMarks );
    }
	
	
	
}
