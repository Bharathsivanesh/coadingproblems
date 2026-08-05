package CoreJava.leetcodes.patterns.arrays;

import java.util.Arrays;

public class AddOne {

    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        digits = new int[n + 1];  //crets new array with 0 [0,0]
        digits[0] = 1;

        return digits;
    }

    public static void main(String[] args) {

        AddOne solution = new AddOne();

        // Test Case 1  only digits value is 0<1 nums<9 below and equal 9
        int[] digits1 = {9};
        System.out.println("Input : " + Arrays.toString(digits1));
        System.out.println("Output: " + Arrays.toString(solution.plusOne(digits1)));


    }
}