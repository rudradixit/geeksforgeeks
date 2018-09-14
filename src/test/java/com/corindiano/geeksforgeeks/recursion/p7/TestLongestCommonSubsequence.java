package com.corindiano.geeksforgeeks.recursion.p7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TestLongestCommonSubsequence {
    @Test
    void testCase1() {
        String[] expected = new String[] { "aeiro" };
        String s1 = "riodejaneiro";
        String s2 = "aveiro";
        assertArrayEquals(expected, LongestCommonSubsequence.calculate(s1, s2));
    }

    @Test
    void testCase2() {
        String[] expected = new String[] {
            "ababa", "abaca", "abcba", "acaba", "acaca", "acbaa", "acbca"
        };

        String s1 = "abcabcaa";
        String s2 = "acbacba";
        assertArrayEquals(expected, LongestCommonSubsequence.calculate(s1, s2));
    }
}