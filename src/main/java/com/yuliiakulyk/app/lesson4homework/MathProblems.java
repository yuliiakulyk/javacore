package main.java.com.yuliiakulyk.app.lesson4homework;

public class MathProblems {
	public double getInterestSum (double intRate, double sumOnAccount) {
		double InterestSum = intRate / 100 * sumOnAccount;
		System.out.println("Having $" + sumOnAccount + " deposited with " + intRate + "% yearly interest rate, you will earn $" + InterestSum +" a year.");
		return InterestSum;
	}
	public double compositeToSimpleInterest (double CompositeMonthlyInterest) {
		double simpleYearlyInterest = Math.pow(1 + CompositeMonthlyInterest / 100, 12);
		System.out.println("Composite monthly interest rate of " + CompositeMonthlyInterest + "% is equal to " + simpleYearlyInterest + "% of simple yearly rate");
		return simpleYearlyInterest;
	}
	
}
