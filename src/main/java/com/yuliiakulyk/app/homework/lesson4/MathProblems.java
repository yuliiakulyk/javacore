package com.yuliiakulyk.app.homework.lesson4;
import static java.lang.System.out;
import java.util.ArrayList;

/**
 * Created by 123 on 15.10.2016.
 */
public class MathProblems {
    public double getInterestSum (double intRate, double sumOnAccount) {
        double InterestSum = intRate / 100 * sumOnAccount;
        out.println("Having $" + sumOnAccount + " deposited with " + intRate + "% yearly interest rate, you will earn $" + InterestSum +" a year.");
        return InterestSum; // The method calculates how much interest in $ per year you receive at a given interest rate and sum on account
    }
    public double compositeToSimpleInterest (double compositeMonthlyInterest) {
        double simpleYearlyInterest = (Math.pow(1 + compositeMonthlyInterest / 100, 12)-1)*100;
        out.println("Composite monthly interest rate of " + compositeMonthlyInterest + "% is equal to " + simpleYearlyInterest + "% of simple yearly rate");
        return simpleYearlyInterest;
    }
    public int multiplyNumbers (ArrayList<Integer> numbers) {
        int productOfNumbers = 1;
        for (int i=0; i<numbers.size(); i++) {
            productOfNumbers = productOfNumbers * numbers.get(i);
        }
        out.println("Product of the numbers is " + productOfNumbers);
        return productOfNumbers;
    }
    public int addNumbers (ArrayList<Integer> numbers) {
        int sumOfNumbers = 0;
        for (int i=0; i<numbers.size(); i++) {
            sumOfNumbers = sumOfNumbers + numbers.get(i);
        }
        out.println("Sum of the numbers is " + sumOfNumbers);
        return sumOfNumbers;
    }
    public int sumNProgressionElements (int firstElement, int step, int numberOfElements) {
        // int sum = (firstElement * 2 + (numberOfElements - 1) * step) / 2 * numberOfElements;
        int sum = firstElement;
        for (int i = 1; i <= numberOfElements - 1; i++) {
            sum = sum + (firstElement + step * i);
        }
        out.println("Sum of " + numberOfElements + " elements of linear regression where 1st element = " + firstElement + ", step = " + step + " is " + sum);
        return sum;
    }
    public boolean isEven (int number) {
        boolean evenOrNot = false;
        if (number % 2 == 0) {
            evenOrNot = true;
        }
        out.println(number + " is even: " + evenOrNot);
        return evenOrNot;
    }
    public boolean areDividedByEachOther (int number1, int number2) {
        boolean isDivided = false;
        int max;
        int min;
        if (number1 > number2) {
            max = number1;
            min = number2;
        } else {
            max = number2;
            min = number1;
        }
        if (max % min == 0) {
            isDivided = true;
        }
        out.println("Number " + max + " is divided by " + min + " without remainder.");
        return isDivided;
    }
    public double getTravelTime (double distance, double speed) {
        double travelTime = distance / speed;
        out.println("Riding " + distance + " km takes " + travelTime + " hours at speed " + speed + " km/h.");
        return travelTime;
    }


}
