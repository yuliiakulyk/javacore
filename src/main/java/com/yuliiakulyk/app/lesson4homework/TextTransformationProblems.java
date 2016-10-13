package main.java.com.yuliiakulyk.app.lesson4homework;
import static java.lang.System.out;

import java.util.ArrayList;

import com.sun.xml.internal.ws.util.StringUtils;

public class TextTransformationProblems {
	public String lowerToUpperCase (String lowerCaseString) {
		String upperCaseString = lowerCaseString.toUpperCase();
		out.println("String in upper case: " + upperCaseString);
		return upperCaseString;
	}
	public char getFirstSymbol (String string1) {
		char firstSymbol = string1.charAt(0);
		out.println("First symbol is: " + firstSymbol);
		return firstSymbol;
	}
	public String removeBracketsAndDashes (String string1) {
		String cleanString;
		/* 
			ArrayList<Integer> indexesOfBrackets = new ArrayList<Integer>();
		}
		char nthSymbol;
		cleanString = string1;
		for (int i=1; i <= string1.length(); i++) {
			nthSymbol=string1.charAt(i);
			if (nthSymbol=='-' || nthSymbol=='(' || nthSymbol==')') {
				indexesOfBrackets.add(i);
			}
		}
		*/
		cleanString = string1.replaceAll("-()", "");
		out.println("Phone number or string without -() is: " + cleanString);		
		return cleanString;
	}
	public char getNextLetterInAplpabet (char letter) {
		char nextLetter = letter;
		nextLetter++;
		out.println("Next letter in alphabet for " + letter + " is " + nextLetter + ".");
		return nextLetter;
	}
	
	
}
