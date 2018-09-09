package com.corindiano.geeksforgeeks.recursion.p1;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestPalindromicPartitions {
    @Test
    void testCase1() {
        String input = "nitin";
        Set<String> expected = new HashSet<>();
        expected.add("n");
        expected.add("i");
        expected.add("t");
        expected.add("iti");
        expected.add("nitin");
        assertEquals(expected, PalindromicPartitions.findPartitions(input));
    }

    @Test
    void testCase2() {
        String input = "geeks";
        Set<String> expected = new HashSet<>();
        expected.add("g");
        expected.add("e");
        expected.add("k");
        expected.add("s");
        expected.add("ee");
        assertEquals(expected, PalindromicPartitions.findPartitions(input));
    }
}