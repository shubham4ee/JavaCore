package day2;

public class StudentWithOverloadingExampleMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.assignValues();
		s2.assignValues(12, "Neel", 78, 89, 66);
		s3.assignValues(19, 82, 78, 86, "Nicky");
		//s2.assignValues("Nikita"); This won't compile as there is no such method available: assignValues(String)
		
		s1.printValues();
		System.out.println("-----------");
		s2.printValues();
		System.out.println("---------");
		s3.printValues();
	}

}
