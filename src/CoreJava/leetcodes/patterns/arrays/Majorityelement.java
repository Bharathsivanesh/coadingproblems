package CoreJava.leetcodes.patterns.arrays;

public class Majorityelement {


    //169

    public static  int majorityElement(int[] nums) {
        int num=nums[0];
        int c=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==num)
            {
                c++;
            }
            else if(c==0)
            {
                num=nums[i];
                c=1;
            }
            else
            {
                c--;
            }
        }
        return num;
    }
    public static void main(String[] args)
    {
        int num[]={3,2,3};
        int ans=majorityElement(num);
        System.out.print("The Majority Element is  "+ans);
    }
}
