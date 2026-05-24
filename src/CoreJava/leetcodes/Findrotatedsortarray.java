package CoreJava.leetcodes;

class Solution {
//1752
    public boolean check(int[] nums) {

        int c = 0;

        for(int i = 1; i < nums.length; i++) {

            if(nums[i - 1] > nums[i]) {
                c++;
            }
        }

        // check last and first element
        if(nums[nums.length - 1] > nums[0]) {
            c++;
        }

        return c <= 1;
    }
}

public class Findrotatedsortarray {

    public static void main(String[] args) {

        Solution s = new Solution();

        int arr[] = {3,4,5,1,2};

        System.out.println(s.check(arr));
    }
}