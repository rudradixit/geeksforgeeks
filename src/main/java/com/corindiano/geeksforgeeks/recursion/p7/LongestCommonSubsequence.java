package com.corindiano.geeksforgeeks.recursion.p7;

import java.util.*;

class LongestCommonSubsequence {
    static String[] calculate(String s1, String s2) {
        String small = s1.length() > s2.length() ? s2 : s1;
        String large = s1.equals(small) ? s2 : s1;
        String[][][] dp = new String[small.length()][large.length()][];
        String[] candidates;

        for (int r=0; r<small.length(); r++) {
            for (int c=0; c<large.length(); c++) {
                if (small.charAt(r) == large.charAt(c)) {
                    if (r == 0 || c == 0) {
                        candidates = new String[]{ "" + small.charAt(r) };
                    } else {
                        candidates = Arrays.copyOf(dp[r - 1][c - 1], dp[r - 1][c - 1].length, String[].class);

                        if (candidates != null) {
                            for (int i = 0; i < candidates.length; i++) {
                                candidates[i] += small.charAt(r);
                            }
                        } else {
                            candidates = new String[]{ "" + small.charAt(r) };
                        }
                    }

                    dp[r][c] = candidates;
                } else {
                    dp[r][c] = unionUpperLeftTopLeft(dp, r, c);
                }
            }
        }

        return dp[small.length() - 1][large.length() - 1];
    }

    private static String[] unionUpperLeftTopLeft(String[][][] dp, int r, int c) {
        Set<String> results = new TreeSet<>();
        int max = 0;

        if (r > 0) {
            for (String s : dp[r - 1][c]) {
                if (s.length() > max) {
                    max = s.length();
                }

                results.add(s);
            }
        }

        if (r > 0 && c > 0) {
            for (String s : dp[r - 1][c - 1]) {
                if (s.length() > max) {
                    max = s.length();
                }

                results.add(s);
            }
        }

        if (c > 0) {
            for (String s : dp[r][c - 1]) {
                if (s.length() > max) {
                    max = s.length();
                }

                results.add(s);
            }
        }

        for (Iterator<String> it = results.iterator(); it.hasNext();) {
            String s = it.next();
            if (s.length() < max) it.remove();
        }

        return results.toArray(new String[0]);
    }
}