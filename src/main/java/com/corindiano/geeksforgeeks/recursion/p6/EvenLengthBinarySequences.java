package com.corindiano.geeksforgeeks.recursion.p6;

import java.util.ArrayList;
import java.util.List;

class EvenLengthBinarySequences {
    private static void _generate(char[] str, int diff, int start, int end, List<String> results) {
        if (start > end) {
            if (diff == 0) {
                results.add(new String(str));
            }
        } else {
            str[start] = '0';
            str[end] = '0';
            _generate(str, diff, start + 1, end - 1, results);

            str[start] = '0';
            str[end] = '1';
            _generate(str, diff + 1, start + 1, end - 1, results);

            str[start] = '1';
            str[end] = '0';
            _generate(str, diff - 1, start + 1, end - 1, results);

            str[start] = '1';
            str[end] = '1';
            _generate(str, diff, start + 1, end - 1, results);
        }
    }

    static List<String> generate(int n) {
        List<String> results = new ArrayList<>();
        char[] str = new char[2 * n];
        int diff = 0, start = 0, end = 2 * n - 1;
        _generate(str, diff, start, end, results);
        return results;
    }
}