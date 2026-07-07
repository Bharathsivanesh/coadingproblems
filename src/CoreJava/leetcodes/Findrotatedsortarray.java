package CoreJava.leetcodes;

public class Findrotatedsortarray {
    public static boolean check(int[] nums) {

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

    public static void main(String[] args) {

        int arr[] = {3,4,5,1,2};

        System.out.println(check(arr));
    }
}