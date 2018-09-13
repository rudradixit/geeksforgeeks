package com.corindiano.geeksforgeeks.recursion.p6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestEvenLengthBinarySequences {
    @Test
    void testCase1() {
        List<String> expected = new ArrayList<>();
        expected.add("0");
        expected.add("1");
        assertEquals(expected, EvenLengthBinarySequences.generate(1));
    }

    @Test
    void testCase2() {
        List<String> expected = new ArrayList<>();
        expected.add("0000");
        expected.add("0101");
        expected.add("0110");
        expected.add("1001");
        expected.add("1010");
        expected.add("1111");
        List<String> results = EvenLengthBinarySequences.generate(2);
        assertEquals(expected.size(), results.size());

        for (String e : expected) {
            assertTrue(results.contains(e));
        }
    }

    @Test
    void testCase3() {
        List<String> expected = new ArrayList<>();
        expected.add("000000");
        expected.add("001001");
        expected.add("001010");
        expected.add("001100");
        expected.add("010001");
        expected.add("010010");
        expected.add("010100");
        expected.add("100001");
        expected.add("100010");
        expected.add("100100");
        expected.add("011011");
        expected.add("011101");
        expected.add("011101");
        expected.add("011011");
        expected.add("011110");
        expected.add("011110");
        expected.add("101011");
        expected.add("101101");
        expected.add("101110");
        expected.add("110011");
        expected.add("110101");
        expected.add("110110");
        expected.add("111111");
        List<String> results = EvenLengthBinarySequences.generate(3);

        for (String e : expected) {
            System.out.printf("Does 'results' contain %s? %n", e);
            assertTrue(results.contains(e));
        }

        for (String r : results) {
            System.out.printf("Does 'expected' contain %s? %n", r);
            assertTrue(expected.contains(r));
        }
    }
}