package com.yuliiakulyk.app.runners;


import com.yuliiakulyk.app.utils.convertors.PrimitiveConvertor;

public class Lesson3Runner {
	public static void main (String args[]) {
		PrimitiveConvertor convertor = new PrimitiveConvertor ();
		float float2 = 110f;
		int int2 = 92;
		char char2 = 'a';
		convertor.floatToChar(float2);
		convertor.intToChar(int2);
		convertor.charToInt(char2);
	}

}
