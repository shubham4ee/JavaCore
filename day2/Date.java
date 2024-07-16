package day2;

public class Date {
	private int day;
	private String month;
	private int year;
	
	public Date() {
		System.out.println("Inside Date constructor");
		day = 1;//this.day = 1;
		month = "January";
		year = 2024;
	}
	
	public Date(int day, String month, int year) {
		System.out.println("Inside Date(int, String, int) constructor");
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void changeYear(int year) {
		this.year = year;//this.year = y;
	}
	/*public Date() {//This is a constructor without parameter: No-Argument Constructor
		System.out.println("Inside Date constructor");
		day = 1;
		month = "January";
		year = 2024;
	}
	public Date(int d, String m, int y) {//This is a Parameterized Constructor
		System.out.println("Inside Date(int, String, int) constructor");
		day = d;
		month = m;
		year = y;
	}*/
	public void assignValues(int d, String m, int y) {
		day = d;
		month = m;
		year = y;
	}
	public void printDate() {
		System.out.println(day + "-" + month + "-" + year);
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
