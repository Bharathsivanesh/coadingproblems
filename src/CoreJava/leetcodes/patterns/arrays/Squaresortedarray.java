package CoreJava.leetcodes.patterns.arrays;

import java.util.Arrays;

public class Squaresortedarray {
    //977
    public int[] sortedSquares(int[] nums) {

        int l = 0;
        int r = nums.length - 1;
        int len = nums.length - 1;

        int[] a = new int[nums.length];

        while (l <= r) {

            if ((nums[l] * nums[l]) < (nums[r] * nums[r])) {

                a[len] = nums[r] * nums[r];
                r--;

            } else {

                a[len] = nums[l] * nums[l];
                l++;
            }

            len--;
        }

        return a;
    }

    public static void main(String[] args) {

        int[] nums = {-4, -1, 0, 3, 10};

        Squaresortedarray solution = new Squaresortedarray();

        int[] result = solution.sortedSquares(nums);

        System.out.println("Sorted squares: " + Arrays.toString(result));
    }
}

