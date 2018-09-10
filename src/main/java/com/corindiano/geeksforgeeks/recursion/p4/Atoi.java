package com.corindiano.geeksforgeeks.recursion.p4;

class Atoi {
    private static int _convert(String str, int multiplier) {
        if (str.isEmpty()) return 0;

        int len = str.length();
        int last = str.charAt(len - 1) - 48;
        return last * multiplier + (_convert(str.substring(0, len - 1), multiplier * 10));
    }

    static int convert(String str) {
        return _convert(str, 1);
    }
}