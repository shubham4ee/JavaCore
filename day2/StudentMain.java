package day2;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.assignValues();
		s1.printValues();
		s1.setPhysicsMarks(80);//Changing the value of the individual field: physicsMarks
		s1.setName("Rohit Kumar");//Changing the value of the individual field: name
		System.out.println("------------------------------------------------");
		s1.printValues();
		System.out.println("---------------------Fetching Individual Field Values: name and mathsMarks-----------");
		String studentName = s1.getName();
		int maths = s1.getMathsMarks();
		System.out.println(studentName + " got " + maths + " marks in Mathematics.");
		
	}

}
