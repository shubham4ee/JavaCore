package day5;

public class InterfaceExampleMain {

	public static void main(String[] args) {
		System.out.println("Today's conversion rates: ");
		System.out.println("USD to INR: " + CurrencyConverter.DOLLAR_TO_RUPEE);
		System.out.println("GBP to INR: " + CurrencyConverter.POUND_TO_RUPEE);
		
		
		CurrencyConverter converter;
		converter = new DollarToRupeeConverter();
		float rupees = converter.doConvert(5000);
		System.out.println("$5000 = INR: " + rupees);
		
		converter = new RupeeToPoundConverter();
		float pounds = converter.doConvert(100000);
		System.out.println("INR: 100000 = GBP: " + pounds);
		
	}

}

