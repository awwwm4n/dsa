package array.checkSorted;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,9,22,35,66};
        System.out.println("Is Array 1 sorted?: " + isSorted(arr1));

        int[] arr2 = {2,5,3,6,88};
        System.out.println("Is Array 2 sorted?: " + isSorted(arr2));
    }

    static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }
}
