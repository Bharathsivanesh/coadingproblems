package CoreJava.leetcodes.patterns.slidingwindow;

import java.util.HashSet;

public class lengthOfLongestUniqueSubstring {

    //3

    public static int lengthOfLongestSubstring(String s) {

        int left = 0;
        int max = 0;

        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    public static void main(String[] args) {

        String s = "abcabcbb";

        int result = lengthOfLongestSubstring(s);

        System.out.println("Length of Longest Unique Substring = " + result);
    }
}