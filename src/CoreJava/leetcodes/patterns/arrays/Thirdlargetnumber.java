package CoreJava.leetcodes.patterns.arrays;

import java.util.HashSet;
import java.util.Set;

public class Thirdlargetnumber {

    public static int thirdMax(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        Set<Integer> set = new HashSet<>();
        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            set.add(nums[i]);

            if (nums[i] == first || nums[i] == second || nums[i] == third)
                continue;

            if (nums[i] >= first) {
                third = second;
                second = first;
                first = nums[i];
            } else if (nums[i] >= second) {
                third = second;
                second = nums[i];
            } else if (nums[i] >= third) {
                third = nums[i];
            }

            max = Math.max(max, nums[i]);
        }

        int num = set.size();

        return num >= 3 ? third : max;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, -2147483648};
        //414

        int ans = thirdMax(nums);

        System.out.println("Answer = " + ans);
    }
}