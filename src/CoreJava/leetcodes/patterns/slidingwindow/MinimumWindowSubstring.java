package CoreJava.leetcodes.patterns.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    //76

    public String minWindow(String s, String t) {

        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        // Store frequency of characters in t
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int min = Integer.MAX_VALUE;
        int left = 0;
        int start = 0;
        int formed = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (need.containsKey(c) &&
                    window.get(c).intValue() == need.get(c).intValue()) {
                formed++;
            }

            while (formed == need.size()) {

                if (right - left + 1 < min) {
                    min = right - left + 1;
                    start = left;
                }

                char ch = s.charAt(left);
                window.put(ch, window.get(ch) - 1);

                if (need.containsKey(ch) &&
                        window.get(ch) < need.get(ch)) {
                    formed--;
                }

                left++;
            }
        }

        return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);
    }

    public static void main(String[] args) {

        MinimumWindowSubstring solution = new MinimumWindowSubstring();

        // Test Case 1
        String s1 = "ADOBECODEBANC";
        String t1 = "ABC";
        System.out.println("Input: s = " + s1 + ", t = " + t1);
        System.out.println("Output: " + solution.minWindow(s1, t1));
        System.out.println();


    }
}