package array.leftRotateByOne;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        leftRotateByOne(arr);
    }

    static void leftRotateByOne(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        for (int i = 0; i < n- 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[n -1] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
