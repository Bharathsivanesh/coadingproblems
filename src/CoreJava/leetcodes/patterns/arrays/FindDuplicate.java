package CoreJava.leetcodes.patterns.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindDuplicate {
    //442

    public List<Integer> findDuplicates(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> lst = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            int data = map.get(nums[i]);

            if (data >= 2) {
                lst.add(nums[i]);
            }
        }

        return lst;
    }

    public static void main(String[] args) {

        FindDuplicate obj = new FindDuplicate();

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result = obj.findDuplicates(nums);

        System.out.println("Duplicate elements: " + result);
    }
}