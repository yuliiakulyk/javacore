package com.yuliiakulyk.runners.utils.convertors;


import com.yuliiakulyk.app.utils.convertors.PrimitiveConvertor;

public class PrimitiveConvertorRunner {
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
