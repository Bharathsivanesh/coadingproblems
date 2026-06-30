package CoreJava.leetcodes.patterns.slidingwindow;

import java.util.HashMap;

public class countAtMostK {

    public int countAtMostKDistinct(int arr[], int k) {

        int l = 0;
        int max = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int r = 0; r < arr.length; r++) {

            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);

            while (map.size() > k) {

                map.put(arr[l], map.get(arr[l]) - 1);

                if (map.get(arr[l]) == 0) {
                    map.remove(arr[l]);
                }

                l++;
            }

            max += (r - l);
        }

        return max + arr.length;
    }

    public static void main(String[] args) {


        //grreks for grreks  subarrays-with-at-most-k-distinct-integer
        countAtMostK obj = new countAtMostK();

        int[] arr = {1, 2, 2, 3};
        int k = 2;

        int result = obj.countAtMostKDistinct(arr, k);

        System.out.println("Number of subarrays with at most " + k + " distinct elements = " + result);
    }
}