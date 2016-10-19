package main.java.com.yuliiakulyk.runners.homework;

import java.util.Scanner;
import main.java.com.yuliiakulyk.app.classwork.lesson5.Calculator;
import static java.lang.System.out;


/**
 * Created by 123 on 15.10.2016.
 */
public class Lesson5Runner {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        boolean doAgain = true;
        do {
            out.println("Enter number of a problem to solve:");
            out.println("1 - are a,b,c sides of a right-angled triangle?");
            out.println("2 - calculate area of a circle with r radius");
            out.println("3 - find out if a number is even or odd");
            out.println("4 - find out which circle area is bigger");
            out.println("5 - exit the program");
            int problemNumber = scanner.nextInt();
            if (problemNumber == 1) {
                out.println("Enter a length:");
                double a = scanner.nextDouble();
                out.println("Enter b length:");
                double b = scanner.nextDouble();
                out.println("Enter c length:");
                double c = scanner.nextDouble();
                if (Calculator.rightAngledTriangleCheck(a, b, c)) {
                    out.println("a, b, c are sides of a right-angled triangle.");
                } else {
                    out.println("a, b, c are not sides of a right-angled triangle.");
                }
            } else if (problemNumber == 2) {
                out.println("Enter a circle radius:");
                double r = scanner.nextDouble();
                out.println("Circle area = " + Calculator.calculateCircleArea(r));
            } else if (problemNumber == 3) {
                out.println("Enter a number:");
                int number = scanner.nextInt();
                if (Calculator.isOdd(number)) {
                    out.println(number + " is odd.");
                } else {
                    out.println(number + " is even.");
                } 
            } else if (problemNumber == 4) {
                out.println("Enter area1:");
                double area1 = scanner.nextDouble();
                System.out.println("Enter area2:");
                double area2 = scanner.nextDouble();
                Calculator.calculateBigger(area1, area2);
            } else if (problemNumber == 5) {
                doAgain = false;
                out.println("Program is closed. Bye!");
            } else {
                out.println("There is no such an option. Try again");
            } // close if
        } while (doAgain);
    } // close method main
} // close class
