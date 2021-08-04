package StudentClassPack1;

import java.util.Scanner;

public class BatchInsamePackage {

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
		std.display();
		
		
	}

}
