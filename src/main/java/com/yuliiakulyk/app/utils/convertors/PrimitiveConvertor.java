package main.java.com.yuliiakulyk.utils.convertors;

public class PrimitiveConvertor {

	public void floatToChar (float floatInputValue) {
		char charFromFloat = (char) floatInputValue;
		System.out.println("Input float value is " + floatInputValue + ". Output char value is " + charFromFloat);
	}
	public void intToChar (int intInputValue) {
		char charFromInt = (char) intInputValue;
		System.out.println("Input int value is " + intInputValue + ". Output char value is " + charFromInt);
	}
	public void charToInt (char charInputValue){
		int intFromChar = (int) charInputValue;
		System.out.println("Input char value is " + charInputValue + ". Output int value is " + intFromChar);
	}

}
