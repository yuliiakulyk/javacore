package com.yuliiakulyk.runners.work.with.string;

import com.yuliiakulyk.app.work.with.string.Palindrome;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 02.11.2016.
 */
public class PalindromeRunner {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        Scanner scanner = new Scanner(System.in);
        do {
            out.println("Enter a string to cleck if it is a palindrome.");
            out.println("Type \"exit\" to close the program.");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            out.println("Method1: is palindrome = " + palindrome.isPalindrome1(input));
            out.println("Method2: is palindrome = " + palindrome.isPalindrome2(input));
            out.println("Method3: is palindrome = " + palindrome.isPalindrome3(input));
            out.println("Method4: is palindrome = " + palindrome.isPalindrome4(input));
            out.println("Method5: is palindrome = " + palindrome.isPalindrome5(input));
            out.println("Method6: is palindrome = " + palindrome.isPalindrome6(input));
        } while (true);
    }
}
