package CoreJava.leetcodes.patterns.arrays;

public class Removelement {
//27
    public int removeElement(int[] nums, int val) {
        int l = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[l] = nums[i];
                l++;
            }
        }

        return l;
    }
    public static void main(String[] args) {
        Removelement obj = new Removelement();

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = obj.removeElement(nums, val);

        System.out.println("k = " + k);

        System.out.print("Array after removing " + val + ": ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
