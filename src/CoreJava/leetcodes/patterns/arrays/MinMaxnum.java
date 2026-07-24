package CoreJava.leetcodes.patterns.arrays;
import java.util.*;

public class MinMaxnum {


    public static ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer>lst=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int n:arr)
        {
            if(max<=n)
            {
                max=n;
            }

            if(min>=n)
            {
                min=n;
            }
        }
        lst.add(min);
        lst.add(max);
        return lst;
    }
    public static void main(String[] args)
    {
        int a[]={1, 4, 3, 5, 8,1, 6};
        ArrayList<Integer>lst=getMinMax(a);
        // find min and max element
        System.out.print(lst);
    }
}
