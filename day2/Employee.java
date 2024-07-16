package day2;

public class Employee {
	//This class declares its fields as 'private'
	//This restricts the fields being modified from outside this class.
	private int empNo;
	private String empName;
	private float empSal;
	
	public void assignValues() {
		//This method is used to assign some values for all the fields
		empNo = 1344;
		empName = "James";
		empSal = 5000.45f;		
	}
	
	public void printValues() {
		System.out.println(empNo);
		System.out.println(empName);
		System.out.println(empSal);
	}
	
	public String getInfo() {
		String empInfo = "Employee No: " + empNo + ", Name: " + empName + ", Salary: " + empSal;
		return empInfo;
	}
	
}




