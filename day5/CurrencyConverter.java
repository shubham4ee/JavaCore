package day5;

public interface CurrencyConverter {
	//Declaring a method: doConvert() which accepts amount to be converted as input and
	//returns converted amount
	float doConvert(float amount);
	//Declaring some 'final' variales for holding conversion rates
	float DOLLAR_TO_RUPEE = 80.76f;
	float POUND_TO_RUPEE = 105.23f;
}
