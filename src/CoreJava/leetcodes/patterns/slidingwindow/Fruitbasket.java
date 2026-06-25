package CoreJava.leetcodes.patterns.slidingwindow;

import java.util.HashMap;

public class Fruitbasket {

    //904

    public static int totalFruit(int[] fruits) {

        int left = 0;
        int max = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {

            int fruit = fruits[right];
            map.put(fruit, map.getOrDefault(fruit, 0) + 1);

            while (map.size() > 2) {

                int leftFruit = fruits[left];

                map.put(leftFruit, map.get(leftFruit) - 1);

                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }

                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    public static void main(String[] args) {

        int[] fruits = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};

        int result = totalFruit(fruits);

        System.out.println("Maximum Fruits Collected = " + result);
    }
}