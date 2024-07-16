package day2;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp = new Employee();
		//emp.empNo = 1001 --> This won't compile because field: empNo is declared as 'private'
		emp.assignValues();
		emp.printValues();
		
		String info = emp.getInfo();
		System.out.println(info);
		
		System.out.println(emp.getInfo());

	}

}
