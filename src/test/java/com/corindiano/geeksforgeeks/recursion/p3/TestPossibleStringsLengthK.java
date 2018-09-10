package com.corindiano.geeksforgeeks.recursion.p3;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestPossibleStringsLengthK {
    @Test
    void testCase1() {
        Set<String> expected = new HashSet<>();
        expected.add("aaa");
        expected.add("aab");
        expected.add("aba");
        expected.add("abb");
        expected.add("baa");
        expected.add("bab");
        expected.add("bba");
        expected.add("bbb");
        assertEquals(expected, PossibleStringsLengthK.generateAll("ab", 3));
    }

    @Test
    void testCase2() {
        Set<String> expected = new HashSet<>();
        expected.add("a");
        expected.add("b");
        expected.add("c");
        expected.add("d");
        assertEquals(expected, PossibleStringsLengthK.generateAll("abcd", 1));
    }

    @Test
    void testCase3() {
        Set<String> expected = new HashSet<>();
        expected.add("aa");
        expected.add("ab");
        expected.add("ac");
        expected.add("ba");
        expected.add("bb");
        expected.add("bc");
        expected.add("ca");
        expected.add("cb");
        expected.add("cc");
        assertEquals(expected, PossibleStringsLengthK.generateAll("abc", 2));
    }
}