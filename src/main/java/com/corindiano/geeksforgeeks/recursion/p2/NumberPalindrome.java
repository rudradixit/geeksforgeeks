package com.corindiano.geeksforgeeks.recursion.p2;

/**
 * Given an integer, write a function that returns true if the
 * given number is palindrome, else false. For example, 12321
 * is palindrome, but 1451 is not palindrome.
 */
class NumberPalindrome {
    static boolean isPalindrome(int number) {
        number = Math.abs(number);

        if (number / 10 == 0) return true;

        int last = number % 10;
        int temp = number / 10;
        int count = 1;
        int digit = -1;

        while (temp != 0) {
            digit = temp % 10;
            temp /= 10;
            count++;
        }

        if (digit == last) {
            int balance = digit * (int)(Math.pow(10, count-2));
            return isPalindrome(number/10 - balance);
        }

        return false;
    }
}