package day2;

public class DateMain {

	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date();
		Date d3 = new Date();
		Date d4 = new Date(24, "April", 2024);
	
		//d1.assignValues(13, "April", 2023);
		d1.printDate();
		d1.setMonth("May");
		d1.printDate();
		d4.printDate();
		
		d4.changeYear(2022);
		d4.printDate();

	}

}
