package com.yuliiakulyk.runners.classwork.lesson10;

import com.yuliiakulyk.app.classwork.lesson10.Palindrome;

import static java.lang.System.out;

/**
 * Created by Yuliia Kulyk on 02.11.2016.
 */
public class PalindromeRunner {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        out.println(palindrome.isPalindrome1("moom"));
        out.println(palindrome.isPalindrome1("primitive"));
        out.println(palindrome.isPalindrome2("mioim"));
        out.println(palindrome.isPalindrome2("primitive"));
        out.println(palindrome.isPalindrome3("asdfdsa"));
        out.println(palindrome.isPalindrome3("primitive"));
    }
}
