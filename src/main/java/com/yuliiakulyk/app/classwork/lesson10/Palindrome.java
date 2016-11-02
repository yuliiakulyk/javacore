package com.yuliiakulyk.app.classwork.lesson10;

/**
 * Created by Yuliia Kulyk on 02.11.2016.
 */
public class Palindrome {
    public boolean isPalindrome1(String string) {
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome2 (String string) {
        String stringReverse = "";
        for (int i = string.length() - 1; i > -1; i--) {
            stringReverse = stringReverse + string.charAt(i);
        }
        if (string.equals(stringReverse)) {
            return true;
        }
        return false;
    }

    public boolean isPalindrome3 (String string) {
        String part1 = "";
        String part2 = "";
        for (int i = 0; i < string.length() / 2; i++) {
            part1 = part1 + string.charAt(i);
            part2 = part2 + string.charAt(string.length() - 1 - i);
        }
        if (part1.equals(part2)) {
            return true;
        }
        return false;
    }

}
