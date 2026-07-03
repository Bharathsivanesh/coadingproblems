package CoreJava.leetcodes.patterns.slidingwindow;

public class NiceSubarrays {

    public int numberOfSubarrays(int[] nums, int k) {

        int l = 0;
        int oddCount = 0;
        int result = 0;
        int temp = 0;

        for (int r = 0; r < nums.length; r++) {

            if (nums[r] % 2 != 0) {
                oddCount++;
                temp = 0;
            }

            while (oddCount == k) {

                temp++;

                if (nums[l] % 2 != 0) {
                    oddCount--;
                }

                l++;
            }

            result += temp;
        }

        return result;
    }

    public static void main(String[] args) {

        NiceSubarrays obj = new NiceSubarrays();

        // Test Case 1
        int[] nums1 = {1, 1, 2, 1, 1};
        int k1 = 3;
        System.out.println("Output: " + obj.numberOfSubarrays(nums1, k1));
        // Expected: 2

    }
}