package CoreJava.leetcodes;

import java.util.HashSet;
//3043
public class findlongestprefix
{
    public static int longestCommonPrefix(int[] arr1, int[] arr2)
    {

        HashSet<String> set = new HashSet<>();

        int max = 0;

        // Store prefixes from arr1
        for (int num : arr1)
        {

            String data = num + "";

            StringBuilder prefix = new StringBuilder();

            for (int i = 0; i < data.length(); i++)
            {

                prefix.append(data.charAt(i));

                set.add(prefix.toString());
            }
        }

        // Check prefixes from arr2
        for (int num : arr2)
        {

            String data = num + "";

            StringBuilder prefix = new StringBuilder();

            for (int i = 0; i < data.length(); i++)
            {

                prefix.append(data.charAt(i));

                if (set.contains(prefix.toString()))
                {

                    max = Math.max(max, prefix.length());
                }
            }
        }

        return max;
    }

    public static void main(String[] args)
    {

        int arr1[] = {1, 10, 100};
        int arr2[] = {1000};

        int ans = longestCommonPrefix(arr1, arr2);

        System.out.println("Longest Common Prefix Length : " + ans);
    }
}