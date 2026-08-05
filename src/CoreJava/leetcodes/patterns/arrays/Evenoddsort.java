package CoreJava.leetcodes.patterns.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//Your have to sort them so that the first part of the array contains odd numbers sorted in descending order, and the rest of the portion contains even numbers sorted in ascending order.
public class Evenoddsort {

    public void sortIt(int[] arr) {

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        // Separate odd and even numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }

        // Sort both lists
        Collections.sort(odd);   // Ascending
        Collections.sort(even);  // Ascending

        // Place odd numbers in descending order
        for (int i = 0; i < odd.size(); i++) {
            arr[i] = odd.get(odd.size() - 1 - i);
        }

        // Place even numbers in ascending order
        int size = odd.size();
        for (int i = 0; i < even.size(); i++) {
            arr[size + i] = even.get(i);
        }
    }

    public static void main(String[] args) {

        Evenoddsort solution = new Evenoddsort();

        int[] arr1 = {1, 2, 3, 5, 4, 7, 10};
        System.out.println("Before: " + Arrays.toString(arr1));
        solution.sortIt(arr1);
        System.out.println("After : " + Arrays.toString(arr1));

      // GFG quention Sort in specific orde
    }
}