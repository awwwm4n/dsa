package array.largestElementInAnArray;

public class Solution {
    public static void main(String[] args) {
        int arr[] = {3,4,1,6,9,2};
        System.out.println("The largest element in the array is: " + findLargestElement(arr));
    }

    static int findLargestElement(int arr[]) {
        int largestElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largestElement) {
                largestElement = arr[i];
            }
        }
        return largestElement;
    }

}