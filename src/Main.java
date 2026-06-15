import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] a = {1,9,5,8,2,9,10};

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int num : a) {

            if(num > max1) {
                max2 = max1;
                max1 = num;
            }
            else if(num > max2 && num != max1) {
                max2 = num;
            }
        }

        System.out.println("Second Largest = " + max2);
    }
}