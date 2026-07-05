package CoreJava.leetcodes.patterns.slidingwindow;

public class DeletingOneElement {

    //1493

    public static int longestSubarray(int[] nums) {
        int c = 0;
        int l = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                c++;
            }

            while (c >= 2) {
                if (nums[l] == 0) {
                    c--;
                }
                l++;
            }

            max = Math.max(max, i - l);
        }

        return max;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 1, 0, 1};
        System.out.println("Output: " + longestSubarray(nums1)); // 3


    }
}