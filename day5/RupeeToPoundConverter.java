package day5;

public class RupeeToPoundConverter implements CurrencyConverter {

	@Override
	public float doConvert(float amountInRupees) {
		// TODO Auto-generated method stub
		float gbPounds = amountInRupees / POUND_TO_RUPEE;
		return gbPounds;
	}

}
