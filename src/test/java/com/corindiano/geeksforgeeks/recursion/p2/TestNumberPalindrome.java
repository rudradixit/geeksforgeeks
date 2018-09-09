package com.corindiano.geeksforgeeks.recursion.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestNumberPalindrome {
    @Test
    void testCase1() {
        assertTrue(NumberPalindrome.isPalindrome(12321));
    }

    @Test
    void testCase2() {
        assertFalse(NumberPalindrome.isPalindrome(1451));
    }

    @Test
    void testCase3() {
        assertTrue(NumberPalindrome.isPalindrome(999999999));
    }
}