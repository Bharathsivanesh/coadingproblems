
package CoreJava.leetcodes.patterns.slidingwindow;
import java.util.*;
public class Maximumuniquesubarrysum {
    public long maximumSubarraySum(int[] nums, int k) {

        int left=0;
        long max=0;
        long sum=0;
        HashSet<Integer>set=new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]))
            {
                set.add(nums[i]);
                sum+=nums[i];

                if(set.size()==k)
                {
                    max=Math.max(sum,max);
                    sum-=nums[left];
                    set.remove(nums[left]);
                    left++;
                }
            }
            else
            {
                while(nums[left]!=nums[i])
                {
                    sum-=nums[left];
                    set.remove(nums[left]);
                    left++;
                }
                left++;
            }
        }
        return max;


    }


    public static void main(String[] args) {
        //Maximumsubarray with uniqu with k window size
        Maximumuniquesubarrysum obj = new Maximumuniquesubarrysum();

        int[] nums = {1,5,4,2,9,9,9};
        int k = 3;

        System.out.println(obj.maximumSubarraySum(nums, k)); // 15
    }
}
