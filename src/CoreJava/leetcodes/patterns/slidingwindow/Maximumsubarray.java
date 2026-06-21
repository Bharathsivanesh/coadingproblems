package CoreJava.leetcodes.patterns.slidingwindow;

public class Maximumsubarray {


    public int maxSubarraySum(int[] nums, int k) {



        int left=0;
        int n=nums.length;

        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        max=Math.max(max,sum);

        for(int right=k;right<n;right++)
        {
            sum=sum-nums[left]+nums[right];
            left++;
            max=Math.max(max,sum);

        }
        return max;

    }

    public static void main(String[] args) {
        //Maximumsubarray with k window size
        Maximumsubarray obj = new Maximumsubarray();

        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println(obj.maxSubarraySum(nums, k)); // 9
    }
}
