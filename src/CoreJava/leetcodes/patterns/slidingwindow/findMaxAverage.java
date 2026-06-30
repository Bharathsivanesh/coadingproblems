package CoreJava.leetcodes.patterns.slidingwindow;

public class findMaxAverage {

    //643

    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;
        int l = 0;
        double max = Integer.MIN_VALUE;

        for (int r = 0; r < nums.length; r++) {

            sum += nums[r];

            if (r - l + 1 > k) {
                sum -= nums[l];
                l++;
            }

            if (r - l + 1 == k) {
                max = Math.max(max, (double) sum / k);
            }
        }

        return max;
    }

    public static void main(String[] args) {

        findMaxAverage obj = new findMaxAverage();

        // Test Case 1
        int[] nums1 = {1, 12, -5, -6, 50, 3};
        int k1 = 4;
        System.out.println("Maximum Average = " + obj.findMaxAverage(nums1, k1));


    }
}