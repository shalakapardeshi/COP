package BatchClassPack2;

import java.util.Scanner;

import StudentClassPack1.Student_Class;

public class Batch_Class {
	private char batch;
	public void accept() {
		Scanner sc= new Scanner(System.in);
		System.out.println("accpeting info in batch");
		System.out.println("Enter Batch: ");
		batch = sc.next().charAt(0);
		sc.close();
		
	}
	public void display() {
		System.out.println("display info in batch");
		System.out.println("Batch  name is: "+batch);
		
	}
	public static void main(String[] args) {
		Student_Class std = new Student_Class();
		System.out.println(std.name);
		System.out.println(std.rollNo);
//		System.out.println(std.grade);  private are not visible in different package ,class,
//		System.out.println(std.totalMarks); default access specifier so not visible in different package
}
}