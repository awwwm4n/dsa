package array.countFrequencyOfEachElementInAnArray;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        System.out.println("Result: " + findFrequencyOfEachElement(arr));

    }

    static Map<Integer, Integer> findFrequencyOfEachElement(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int e: arr) {
            if (map.get(e) == null) {
                map.put(e, 1);
            } else {
                map.put(e, map.get(e)+1);
            }
        }
        return map;
    }
}
