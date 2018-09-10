package com.corindiano.geeksforgeeks.recursion.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestAtoi {
    @Test
    void testCase1() {
        assertEquals(101, Atoi.convert("101"));
    }

    @Test
    void testCase2() {
        assertEquals(9, Atoi.convert("9"));
    }
}