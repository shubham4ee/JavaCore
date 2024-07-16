package day2;

public class Student {
	private int rollNo;
	private String name;
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhysicsMarks() {
		return physicsMarks;
	}
	public void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}
	public int getChemistryMarks() {
		return chemistryMarks;
	}
	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}
	public int getMathsMarks() {
		return mathsMarks;
	}
	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	public void assignValues() {//Assigning default values
		rollNo = 32;
		name = "Rohit";
		physicsMarks = 89;
		chemistryMarks = 99;
		mathsMarks = 92;
	}
	public void assignValues(int rno, String nm, int phy, int chem, int mt) {//Assigning customized values
		System.out.println("Inside assignValues(int, String, int, int, int)");
		rollNo = rno;
		name = nm;
		physicsMarks = phy;
		chemistryMarks = chem;
		mathsMarks = mt;
	}
	public void assignValues(int rno, int phy, int chem, int mt, String nm) {//Assigning customized values
		System.out.println("Inside assignValues(int, int, int, int, String)");
		rollNo = rno;
		name = nm;
		physicsMarks = phy;
		chemistryMarks = chem;
		mathsMarks = mt;
	}
	public void printValues() {
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(physicsMarks);
		System.out.println(chemistryMarks);
		System.out.println(mathsMarks);
		
	}
	
}


