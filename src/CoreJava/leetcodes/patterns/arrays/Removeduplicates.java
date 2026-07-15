package CoreJava.leetcodes.patterns.arrays;

import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {

        int l = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[l] != nums[i]) {
                l++;

                int t = nums[l];
                nums[l] = nums[i];
                nums[i] = t;
            }
        }

        return l + 1;
    }
}

public class Removeduplicates {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};

        Solution solution = new Solution();

        int k = solution.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }


    }
}