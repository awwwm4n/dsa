package array.findSecondLargestAndSecondSmallestElement;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = {1,2,4,6,4,3,2,36,32};
        findSecondLargestAndSecondSmallestElement(arr1);
        int[] arr2 = {0};
        findSecondLargestAndSecondSmallestElement(arr2);
        int[] arr3 = {1,1,1,1};
        findSecondLargestAndSecondSmallestElement(arr3);
    }

    static void findSecondLargestAndSecondSmallestElement(int[] arr) {

        int secondSmallest = Integer.MAX_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        if (arr.length > 2) {
            int smallest = Integer.MAX_VALUE;
            int largest = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];
                } else if (arr[i] > secondLargest && arr[i] != largest) {
                    secondLargest = arr[i];
                }
                if (arr[i] < smallest) {
                    secondSmallest = smallest;
                    smallest = arr[i];
                } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                    secondSmallest = arr[i];
                }
            }
        }

        if (secondSmallest == Integer.MAX_VALUE)
            secondSmallest = -1;

        if (secondLargest == Integer.MIN_VALUE)
            secondLargest = -1;

        System.out.println("Second largest: " + secondLargest + ", Second smallest: " + secondSmallest);
    }
}
