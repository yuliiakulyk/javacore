package com.yuliiakulyk.app.work_with_string;

/**
 * Created by Yuliia Kulyk on 02.11.2016.
 */
public class Palindrome {
    public boolean isPalindrome1(String string) {
        string = string.toLowerCase();
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome2 (String string) {
        string = string.toLowerCase();
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
        string = string.toLowerCase();
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

    public boolean isPalindrome4 (String string) {
        string = string.toLowerCase();
        char[] charArray = string.toCharArray();
        for (int i = 0; i < string.length() / 2; i++) {
            if (charArray[i] != charArray[string.length() - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome5 (String string) {
        string = string.toLowerCase();
        String reflected1Half = "";
        for (int i = string.length() / 2 - 1; i > -1; i-- ) {
            reflected1Half += string.charAt(i);
        }
        return string.substring(string.length() - string.length() / 2).equals(reflected1Half);
    }

    public boolean isPalindrome6 (String string) {
        string = string.toLowerCase();
        return string.equals(new StringBuilder(string).reverse().toString());
    }

}
