package com.corindiano.geeksforgeeks.recursion.p1;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, find all possible palindromic partitions of given string.
 *
 * Examples
 *
 * Input: nitin
 * Output:
 *  n i t i n
 *  n iti n
 *  nitin
 *
 * Input: geeks
 * Output:
 *  g e e k s
 *  g ee ks
 *
 */
class PalindromicPartitions {
    private static boolean isPalindrome(String str) {
        int s = 0;
        int e = str.length() - 1;

        while (s < e) {
            if (str.charAt(s) != str.charAt(e)) return false;
            s++;
            e--;
        }

        return true;
    }

    private static void _findPartitions(String str, Set<String> results) {
        if (results.contains(str)) return;

        if (str.length() == 1) {
            results.add(str);
            return;
        }

        if (isPalindrome(str)) {
            results.add(str);
        }

        String starting = str.substring(0, str.length() - 1);
        String ending = str.substring(1);

        if (!results.contains(starting)) _findPartitions(starting, results);
        if (!results.contains(ending)) _findPartitions(ending, results);
    }

    static Set<String> findPartitions(String str) {
        if (str == null) throw new IllegalArgumentException("Invalid str!");
        Set<String> results = new HashSet<>();
        _findPartitions(str, results);
        return results;
    }
}