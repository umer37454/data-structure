//reversing an array

package Arrays_01;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {4, 8, 5, 6, 2, 7, 9, 6, 2, 15, 96, 25};
        reverse(arr); // passing by reference
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        //swapping approach
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
