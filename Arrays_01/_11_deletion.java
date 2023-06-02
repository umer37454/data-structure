package Arrays_01;

import java.util.Arrays;

public class _11_deletion {
    public static void main(String[] args) {
        int[] arr = {54, 25, 63, 87, 56, 14, 47, 36};

        int element = 36;

        int[] result = delete(arr, element);
        System.out.println(Arrays.toString(result));

        delete2(arr, element);
        delete3(arr, element);
    }

    //by copying in another array
    static int[] delete(int[] arr, int element) {
        int[] result = new int[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }

        for (int k = 0; k < result.length; k++) {
            result[k] = arr[k];
        }
        return result;
    }

    //by swapping in same array without printing last element
    static void delete2(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (i == element) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }

        System.out.print("[");
        for(int k = 0; k < arr.length - 1; k++){
            System.out.print(" " + arr[k] + " ");
        }
        System.out.println("]");
    }

    //by copying in another array - 2nd method
    static void delete3(int[] arr, int element) {
        int[] result = new int[arr.length - 1];
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
            }
        }

        for (int j = 0; j < result.length; j++) {
            if (j < index) {
                result[j] = arr[j];
            } else if (j == index) {
                result[j] = arr[j + 1];
            } else {
                result[j] = arr[j];
            }
        }

        for (int k : result) {
            System.out.print(k + " ");
        }
    }
}