package TestStudentPack3;

import BatchClassPack2.Batch_Class;
import StudentClassPack1.Student_Class;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student_Class stud1 = new Student_Class();
		stud1.accept();
		stud1.display();
		Batch_Class batch = new Batch_Class();
		batch.accept();
        batch.display();
	}

}
