package com.corindiano.geeksforgeeks.recursion.p3;

import java.util.HashSet;
import java.util.Set;

class PossibleStringsLengthK {
    private static Set<String> _generateAll(String chars, int k) {
        if (k == 0) {
            Set<String> r = new HashSet<>();
            r.add("");
            return r;
        }

        Set<String> r = new HashSet<>();

        for (Character c : chars.toCharArray()) {
            Set<String> partial = _generateAll(chars, k-1);

            for (String p : partial) {
                r.add(c + p);
            }
        }

        return r;
    }

    static Set<String> generateAll(String chars, int k) {
        return _generateAll(chars, k);
    }
}