package Arrays_01;

import java.util.Arrays;

public class _12_insertion {
    public static void main(String[] args) {
        int[] arr = {45, 25, 56, 45, 87};
        int element = 52;
        int index = 3;
        int[] result = insert(arr, element, index);
        System.out.println(Arrays.toString(result));
    }

    static int[] insert(int[] arr, int element, int index) {
        int[] result = new int[arr.length + 1];

        for (int i = 0; i < result.length; i++) {
            if(i < index){ // 45 25 56
                result[i] = arr[i];
            } else if (i == index) { //45 25 56 52
                result[i] = element;
            } else {  // 45 87
                result[i] = arr[i-1];
            }
        }

        return result;
    }
}
