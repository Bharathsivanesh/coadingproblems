package CoreJava.leetcodes.patterns.slidingwindow;

import java.util.TreeMap;

public class characterReplacement {

    //424

    public static int characterReplacement(String s, int k) {

        TreeMap<Character, Integer> map = new TreeMap<>();  //or use // int[]a=new int[26]; track frequnecy

        int maxfreq = 0;
        int l = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

            maxfreq = Math.max(maxfreq, map.get(s.charAt(i)));

            if ((i - l + 1) - maxfreq > k) {

                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;

            }

                max = Math.max(max, i - l + 1);

        }

        return max;
    }

    public static void main(String[] args) {

        //https://www.youtube.com/watch?v=ExY8svHF_Eo&t=2s   nikil lokia for clearence

        String s = "AABABBA";
        int k = 1;

        int ans = characterReplacement(s, k);

        System.out.println("Longest Repeating Character Replacement Length = " + ans);
    }
}