
package CoreJava.leetcodes.patterns.hashmap;
import java.util.*;

public class Consecutivenumber {
    //128

    public static int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        TreeMap<Integer,Integer>tree=new TreeMap<>();
        for(int i=0;i<nums.length;i++)
        {
            tree.put(nums[i],0);
        }
        ArrayList<Integer>lst=new ArrayList<>(tree.keySet());
        int c=1;
        int max=1;

        for(int i=0;i<lst.size()-1;i++)
        {
            if(lst.get(i)+1==lst.get(i+1))
            {
                c++;
            }
            else
            {
                c=1;
            }
            max=Math.max(max,c);

        }
        return max;
    }

    public static void main(String[] args)
    {
        int n[]={0,1,5,6,7,8};
        int ans=longestConsecutive(n);
        System.out.print("The Consecutive number is"+ans);
    }
}
